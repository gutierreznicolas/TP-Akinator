package Controlador;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

import Modelo.PaisesDelJuego;

public class BDAmericaDelNorte {
	
	private HerramientasInterface herramientas=new HerramientasInterface();
	private JLabel imagen1=new JLabel();
	private JLabel imagen2=new JLabel();
	private JLabel imagen3=new JLabel();
	private Clip sonidos;
	
	public void BDAmericaNorte(JFrame Pantalla) {
		PaisesDelJuego paises=new PaisesDelJuego();
		paises.eliminarPorContinente("Norte America");
		herramientas.CambiarColor(Pantalla, Color.PINK);
		herramientas.ponerIcono("imagenes\\icono.jpg", Pantalla);
		try{
			sonidos= AudioSystem.getClip();
			File a = new File("sonido\\musica Norteamericana.wav");
			sonidos.open(AudioSystem.getAudioInputStream(a));
			sonidos.start();
			
			}
			catch (Exception tipoerror) {
				System.out.println("" + tipoerror);
			}
		JButton botonSI1=new JButton("SI");
		JButton botonNO1=new JButton("NO");
		JButton botonNOSE1=new JButton("NO SE");
		
		//Pregunta 1
		herramientas.CargarImagen(imagen1,"imagenes\\756fae1326eec94458c9861d517c23dd.png" ,10, 61, 247, 417 , Pantalla);
		herramientas.CargarImagen(imagen2,"imagenes\\img-thing (24) - copia.jpg" ,179, 0, 245, 175 , Pantalla);
		herramientas.CargarImagen(imagen3,"imagenes\\images.jpg" ,287, 208, 268, 242 , Pantalla);
		herramientas.crearBoton(botonSI1, 22, 531, 89, 23, Pantalla, Color.CYAN, 16);
		herramientas.crearBoton(botonNO1,243, 533, 89, 23, Pantalla, Color.RED, 16);
		herramientas.crearBoton(botonNOSE1, 458, 528, 89, 23, Pantalla, Color.GREEN, 16);
		JLabel PaisesenJuego1=new JLabel("PAISES POSIBLES:"+paises.CantPaises(paises));
		herramientas.PaisesEnJuego(PaisesenJuego1, Pantalla);
		//SI DICE QUE SI A LA PREGUNTA 1
		botonSI1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				herramientas.sonidoCorto( sonidos);
				Pantalla.setVisible(false);
				paises.eliminarPorCarac("español");
				sonidos.close();
				herramientas.paisElegido(paises.darPais());
			}
		});
			//SI DICE QUE NO A LA PREGUNTA 1
			botonNO1.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					herramientas.sonidoCorto(sonidos);
					paises.eliminarSiCumpleLaCaracteristica("español");
					herramientas.ponerEnFalsoBotones(botonSI1, botonNO1, botonNOSE1);
					JButton botonSI2=new JButton("SI");
					JButton botonNO2=new JButton("NO");
					JButton botonNOSE2=new JButton("NO SE");
					PaisesenJuego1.setVisible(false);
					//PREGUNTA 2 
					herramientas.CargarImagen(imagen1,"imagenes\\756fae1326eec94458c9861d517c23dd.png" ,10, 61, 247, 417 , Pantalla);
					herramientas.CargarImagen(imagen2,"imagenes\\img-thing (25) - copia.jpg" ,168, 11, 233, 156 , Pantalla);
					herramientas.CargarImagen(imagen3,"imagenes\\TRUMP.jpg",296, 194, 307, 222 , Pantalla);
					herramientas.crearBoton(botonSI2, 22, 531, 89, 23, Pantalla, Color.CYAN, 16);
					herramientas.crearBoton(botonNO2,243, 533, 89, 23, Pantalla, Color.RED, 16);
					herramientas.crearBoton(botonNOSE2, 458, 528, 89, 23, Pantalla, Color.GREEN, 16);
					JLabel PaisesenJuego2=new JLabel("PAISES POSIBLES:"+paises.CantPaises(paises));
					herramientas.PaisesEnJuego(PaisesenJuego2, Pantalla);
					//SI DICE QUE SI A LA PREGUNTA 2
					botonSI2.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent e) {
							herramientas.sonidoCorto(sonidos);
							Pantalla.setVisible(false);
							paises.eliminarPorCarac("Trump");
							herramientas.paisElegido(paises.darPais());
							sonidos.close();
						}
					});
					//SI DICE QUE NO A LA PREGUNTA 2
					botonNO2.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent e) {
							herramientas.sonidoCorto( sonidos);
							Pantalla.setVisible(false);
							paises.eliminarSiCumpleLaCaracteristica("Trump");
							herramientas.paisElegido(paises.darPais());
							sonidos.close();
						}
					});
					//SI DICE NO SE A LA PREGUNTA 2
					botonNOSE2.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent e) {
							herramientas.sonidoCorto(sonidos);
							herramientas.usuarioSinIdea(Pantalla);
							sonidos.close();
						}
					});
				}
		});
			//SI DICE NO SE A LA PREGUNTA 1
			botonNOSE1.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					herramientas.sonidoCorto( sonidos);
					herramientas.usuarioSinIdea(Pantalla);
					sonidos.close();
				}
			});
	}
		
	

}
