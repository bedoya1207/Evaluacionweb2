package ec.edu.ups.evabedoyamanuel.view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.xml.namespace.QName;

import ec.edu.ups.evabedoyamanuel.services.Exception_Exception;
import ec.edu.ups.evabedoyamanuel.services.Libro;
import ec.edu.ups.evabedoyamanuel.services.LibroServicesSOAP;
import ec.edu.ups.evabedoyamanuel.services.LibroServicesSOAPService;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTextPane;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.awt.event.ActionEvent;
import javax.swing.JScrollPane;

public class vistalibro extends JFrame {

	private JPanel contentPane;
	private JTextField txtcodigo;
	private JTextField txtTitulo;
	private JTextField txtAutor;
	private JTextField txtEdicion;
	private JTextArea textArea;
	private static LibroServicesSOAP port;
	private static final QName SERVICE_NAME = new QName("http://services.EVAbedoyamanuel.ups.edu.ec/", "LibroServicesSOAPService");
	JTextArea txtArea;
	/**
	 * Launch the application.
	 */
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					vistalibro frame = new vistalibro();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
        URL wsdlURL = LibroServicesSOAPService.WSDL_LOCATION;
        if (args.length > 0 && args[0] != null && !"".equals(args[0])) {
            File wsdlFile = new File(args[0]);
            try {
                if (wsdlFile.exists()) {
                    wsdlURL = wsdlFile.toURI().toURL();
                } else {
                    wsdlURL = new URL(args[0]);
                }
            } catch (MalformedURLException e) {
                e.printStackTrace();
            }
        }
        LibroServicesSOAPService ss = new LibroServicesSOAPService(wsdlURL, SERVICE_NAME);
        port = ss.getLibroServicesSOAPPort();
	}


	/**
	 * Create the frame.
	 */
	public vistalibro() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 772, 504);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Codigo");
		lblNewLabel.setBounds(58, 98, 45, 13);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Titulo");
		lblNewLabel_1.setBounds(58, 156, 45, 13);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Autor");
		lblNewLabel_2.setBounds(58, 234, 45, 13);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Edicion");
		lblNewLabel_3.setBounds(58, 285, 37, 28);
		contentPane.add(lblNewLabel_3);
		
		txtcodigo = new JTextField();
		txtcodigo.setBounds(138, 95, 96, 19);
		contentPane.add(txtcodigo);
		txtcodigo.setColumns(10);
		
		txtTitulo = new JTextField();
		txtTitulo.setBounds(138, 153, 96, 19);
		contentPane.add(txtTitulo);
		txtTitulo.setColumns(10);
		
		txtAutor = new JTextField();
		txtAutor.setBounds(138, 231, 96, 19);
		contentPane.add(txtAutor);
		txtAutor.setColumns(10);
		
		txtEdicion = new JTextField();
		txtEdicion.setBounds(138, 290, 96, 19);
		contentPane.add(txtEdicion);
		txtEdicion.setColumns(10);
		
		JButton Insertar = new JButton("Insertar");
		Insertar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Libro l = new Libro();
				l.setCodigo(Integer.parseInt(txtcodigo.getText()));
				l.setAutor(txtAutor.getText());
				l.setEdicion(txtEdicion.getText());
				l.setTitulo(txtTitulo.getText());
				try {
					port.crearlibro(l);
				} catch (Exception_Exception e1) {
					
					e1.printStackTrace();
				}
				
			}
		});
		Insertar.setBounds(129, 339, 85, 21);
		contentPane.add(Insertar);
		
		JButton Listar = new JButton("Listar");
		Listar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtArea.setText("");
		    	List<Libro> lista = port.getlibros();
		    	for(Libro libro:lista) {
		    		txtArea.append(libro.getAutor()+"\n");
		    		txtArea.append(libro.getEdicion()+"\n");
		    		txtArea.append(libro.getTitulo()+"\n");
		    		txtArea.append(libro.getCodigo()+"\n");
		    	}
			}
		});
		Listar.setBounds(467, 58, 85, 21);
		contentPane.add(Listar);
		 txtArea = new JTextArea();

		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(373, 220, 265, 157);
		contentPane.add(scrollPane);
		
		
		scrollPane.setViewportView(txtArea);
	}
	
	public void btningresar() {
		
	}
}
