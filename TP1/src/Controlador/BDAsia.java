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

public class BDAsia {
	
	private HerramientasInterface herramientas=new HerramientasInterface();
	private JLabel imagen1=new JLabel();
	private JLabel imagen2=new JLabel();
	private JLabel imagen3=new JLabel();
	private PaisesDelJuego paises=new PaisesDelJuego();
	private Clip sonidos;

	
	public void BDasia(JFrame Pantalla) {
		paises.eliminarPorContinente("Asia");
		herramientas.CambiarColor(Pantalla, Color.CYAN);
		herramientas.ponerIcono("imagenes\\icono.jpg", Pantalla);
		try{
			sonidos= AudioSystem.getClip();
			File a = new File("sonido\\musica Asiatica.wav");
			sonidos.open(AudioSystem.getAudioInputStream(a));
			sonidos.start();
			
			}
			catch (Exception tipoerror) {
				System.out.println("" + tipoerror);
			}
		JButton botonSI1=new JButton("SI");
		JButton botonNO1=new JButton("NO");
		JButton botonNOSE1=new JButton("NO SE");
		//PREGUNTA 1
		herramientas.CargarImagen(imagen1,"imagenes\\756fae1326eec94458c9861d517c23dd.png" ,-30, 67, 252, 460 , Pantalla);
		herramientas.CargarImagen(imagen2,"imagenes\\img-thing (38) - copia - copia.jpg" ,161, 11, 300, 137 , Pantalla);
		herramientas.CargarImagen(imagen3,"imagenes\\image15 - copia.png",134, 147, 450, 346 , Pantalla);
		herramientas.crearBoton(botonSI1, 22, 531, 89, 23, Pantalla, Color.CYAN, 16);
		herramientas.crearBoton(botonNO1,243, 533, 89, 23, Pantalla, Color.RED, 16);
		herramientas.crearBoton(botonNOSE1, 458, 528, 89, 23, Pantalla, Color.GREEN, 16);
		JLabel PaisesenJuego1=new JLabel("PAISES POSIBLES:"+paises.CantPaises(paises));
		herramientas.PaisesEnJuego(PaisesenJuego1, Pantalla);
		//SI DICE QUE SI A LA PREGUNTA 1
		botonSI1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				herramientas.sonidoCorto( sonidos);
				paises.eliminarPorCarac("este");
				herramientas.ponerEnFalsoBotones(botonSI1, botonNO1, botonNOSE1);
				JButton botonSI2=new JButton("SI");
				JButton botonNO2=new JButton("NO");
				JButton botonNOSE2=new JButton("NO SE");
				PaisesenJuego1.setVisible(false);
				//PREGUNTA 2
				herramientas.CargarImagen(imagen1,"imagenes\\756fae1326eec94458c9861d517c23dd.png" ,-30, 67, 252, 460 , Pantalla);
				herramientas.CargarImagen(imagen2,"imagenes\\img-thing (39) - copia - copia.jpg" ,128, 11, 234, 153 , Pantalla);
				herramientas.CargarImagen(imagen3,"imagenes\\norte sur asia.png" ,128, 171, 456, 337 , Pantalla);
				herramientas.crearBoton(botonSI2, 22, 531, 89, 23, Pantalla, Color.CYAN, 16);
				herramientas.crearBoton(botonNO2,243, 533, 89, 23, Pantalla, Color.RED, 16);
				herramientas.crearBoton(botonNOSE2, 458, 528, 89, 23, Pantalla, Color.GREEN, 16);
				JLabel PaisesenJuego2=new JLabel("PAISES POSIBLES:"+paises.CantPaises(paises));
				herramientas.PaisesEnJuego(PaisesenJuego2, Pantalla);
				//SI DICE QUE SI A LA PREGUNTA 2
				botonSI2.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						herramientas.sonidoCorto( sonidos);
						paises.eliminarPorCarac("norte");
						herramientas.ponerEnFalsoBotones(botonSI2, botonNO2, botonNOSE2);
						JButton botonSI3=new JButton("SI");
						JButton botonNO3=new JButton("NO");
						JButton botonNOSE3=new JButton("NO SE");
						PaisesenJuego2.setVisible(false);
						//PREGUNTA 3
						herramientas.CargarImagen(imagen1,"imagenes\\756fae1326eec94458c9861d517c23dd.png" ,-30, 67, 252, 460 , Pantalla);
						herramientas.CargarImagen(imagen2,"imagenes\\img-thing (40) - copia - copia.jpg" ,129, 30, 243, 139 , Pantalla);
						herramientas.CargarImagen(imagen3,"imagenes\\1394979.jpg" ,184, 212, 400, 270 , Pantalla);
						herramientas.crearBoton(botonSI3, 22, 531, 89, 23, Pantalla, Color.CYAN, 16);
						herramientas.crearBoton(botonNO3,243, 533, 89, 23, Pantalla, Color.RED, 16);
						herramientas.crearBoton(botonNOSE3, 458, 528, 89, 23, Pantalla, Color.GREEN, 16);
						JLabel PaisesenJuego3=new JLabel("PAISES POSIBLES:"+paises.CantPaises(paises));
						herramientas.PaisesEnJuego(PaisesenJuego3, Pantalla);
						//SI DICE QUE SI A LA PREGUNTA 3
						botonSI3.addActionListener(new ActionListener() {
							public void actionPerformed(ActionEvent e) {
								herramientas.sonidoCorto( sonidos);
								paises.eliminarPorCarac("korea");
								herramientas.ponerEnFalsoBotones(botonSI3, botonNO3, botonNOSE3);
								JButton botonSI4=new JButton("SI");
								JButton botonNO4=new JButton("NO");
								JButton botonNOSE4=new JButton("NO SE");
								PaisesenJuego3.setVisible(false);
								//PREGUNTA 4
								herramientas.CargarImagen(imagen1,"imagenes\\756fae1326eec94458c9861d517c23dd.png" ,-30, 67, 252, 460 , Pantalla);
								herramientas.CargarImagen(imagen2,"imagenes\\img-thing (41) - copia - copia.jpg" ,128, 11, 233, 162 , Pantalla);
								herramientas.CargarImagen(imagen3,"imagenes\\450_1000.jpg" ,183, 184, 391, 324 , Pantalla);
								herramientas.crearBoton(botonSI4, 22, 531, 89, 23, Pantalla, Color.CYAN, 16);
								herramientas.crearBoton(botonNO4,243, 533, 89, 23, Pantalla, Color.RED, 16);
								herramientas.crearBoton(botonNOSE4, 458, 528, 89, 23, Pantalla, Color.GREEN, 16);
								JLabel PaisesenJuego4=new JLabel("PAISES POSIBLES:"+paises.CantPaises(paises));
								herramientas.PaisesEnJuego(PaisesenJuego4, Pantalla);
								//SI DICE QUE SI PREGUNTA 4
								botonSI4.addActionListener(new ActionListener() {
									public void actionPerformed(ActionEvent e) {
										herramientas.sonidoCorto( sonidos);
										paises.eliminarPorCarac("sur");
										Pantalla.setVisible(false);
										herramientas.paisElegido(paises.darPais());
										sonidos.close();
										
									}
								});
								//SI DICE QUE NO PREGUNTA 4
								botonNO4.addActionListener(new ActionListener() {
									public void actionPerformed(ActionEvent e) {
										herramientas.sonidoCorto(sonidos);
										paises.eliminarSiCumpleLaCaracteristica("sur");
										Pantalla.setVisible(false);
										herramientas.paisElegido(paises.darPais());
										sonidos.close();
									}
								});
								//SI DICE NOSE PREGUNTA 4
								botonNOSE4.addActionListener(new ActionListener() {
									public void actionPerformed(ActionEvent e) {
										herramientas.sonidoCorto(sonidos);
										herramientas.usuarioSinIdea(Pantalla);
										sonidos.close();
									}
								});
							}
						});
						//SI DICE QUE NO A LA PREGUNTA 3
						botonNO3.addActionListener(new ActionListener() {
							public void actionPerformed(ActionEvent e) {
								herramientas.sonidoCorto(sonidos);
								paises.eliminarSiCumpleLaCaracteristica("korea");
								herramientas.ponerEnFalsoBotones(botonSI3, botonNO3, botonNOSE3);
								JButton botonSI5=new JButton("SI");
								JButton botonNO5=new JButton("NO");
								JButton botonNOSE5=new JButton("NO SE");
								PaisesenJuego3.setVisible(false);
								//PREGUNTA 5
								herramientas.CargarImagen(imagen1,"756fae1326eec94458c9861d517c23dd.png" ,0, 67, 252, 460 , Pantalla);
								herramientas.CargarImagen(imagen2,"imagenes\\img-thing (42) - copia - copia.jpg" ,158, 11, 247, 143, Pantalla);
								herramientas.CargarImagen(imagen3,"imagenes\\Aibo_02_1024x1024.jpg" ,228, 165, 356, 362 , Pantalla);
								herramientas.crearBoton(botonSI5, 22, 531, 89, 23, Pantalla, Color.CYAN, 16);
								herramientas.crearBoton(botonNO5,243, 533, 89, 23, Pantalla, Color.RED, 16);
								herramientas.crearBoton(botonNOSE5, 458, 528, 89, 23, Pantalla, Color.GREEN, 16);
								JLabel PaisesenJuego5=new JLabel("PAISES POSIBLES:"+paises.CantPaises(paises));
								herramientas.PaisesEnJuego(PaisesenJuego5, Pantalla);
								//SI DICE QUE SI A LA PREGUNTA 5
								botonSI5.addActionListener(new ActionListener() {
									public void actionPerformed(ActionEvent e) {
										herramientas.sonidoCorto(sonidos);
										paises.eliminarPorCarac("tecnologia");
										Pantalla.setVisible(false);
										herramientas.paisElegido(paises.darPais());
										sonidos.close();
									}
								});
								//SI DICE QUE NO A LA PREGUNTA 5
								botonNO5.addActionListener(new ActionListener() {
									public void actionPerformed(ActionEvent e) {
										herramientas.sonidoCorto(sonidos);
										paises.eliminarSiCumpleLaCaracteristica("tecnologia");
										Pantalla.setVisible(false);
										herramientas.paisElegido(paises.darPais());
										sonidos.close();
									}
								});
								//SI DICE NOSE A LA PREGUNTA 5
								botonNOSE5.addActionListener(new ActionListener() {
									public void actionPerformed(ActionEvent e) {
										herramientas.sonidoCorto(sonidos);
										herramientas.ponerEnFalsoBotones(botonSI5, botonNO5, botonNOSE5);
										JButton botonSI6=new JButton("SI");
										JButton botonNO6=new JButton("NO");
										JButton botonNOSE6=new JButton("NO SE");
										PaisesenJuego5.setVisible(false);
										//PREGUNTA 6
										herramientas.CargarImagen(imagen1,"756fae1326eec94458c9861d517c23dd.png" ,-19, 66, 252, 460 , Pantalla);
										herramientas.CargarImagen(imagen2,"imagenes\\img-thing (43) - copia - copia.jpg" ,160, 0, 252, 171 , Pantalla);
										herramientas.CargarImagen(imagen3,"imagenes\\image15.png",160, 171, 424, 316 , Pantalla);
										herramientas.crearBoton(botonSI6, 22, 531, 89, 23, Pantalla, Color.CYAN, 16);
										herramientas.crearBoton(botonNO6,243, 533, 89, 23, Pantalla, Color.RED, 16);
										herramientas.crearBoton(botonNOSE6, 458, 528, 89, 23, Pantalla, Color.GREEN, 16);
										JLabel PaisesenJuego6=new JLabel("PAISES POSIBLES:"+paises.CantPaises(paises));
										herramientas.PaisesEnJuego(PaisesenJuego6, Pantalla);
										//SI DICE QUE SI A LA PREGUNTA 6
										botonSI6.addActionListener(new ActionListener() {
											public void actionPerformed(ActionEvent e) {
												herramientas.sonidoCorto(sonidos);
												paises.eliminarPorCarac("grande");
												Pantalla.setVisible(false);
												herramientas.paisElegido(paises.darPais());
												sonidos.close();
												}
										});
										//SI DICE QUE NO A LA PREGUNTA 6
										botonNO6.addActionListener(new ActionListener() {
											public void actionPerformed(ActionEvent e) {
												herramientas.sonidoCorto(sonidos);
												paises.eliminarSiCumpleLaCaracteristica("grande");
												Pantalla.setVisible(false);
												herramientas.paisElegido(paises.darPais());
												sonidos.close();
											}
										});
										//SI DICE NOSE A LA PREGUNTA 6
										botonNOSE6.addActionListener(new ActionListener() {
											public void actionPerformed(ActionEvent e) {
												herramientas.sonidoCorto(sonidos);
												herramientas.usuarioSinIdea(Pantalla);
												sonidos.close();
											}
										});
									}
								});
							}
						});
						//SI DICE NOSE PREGUNTA 3
						botonNOSE3.addActionListener(new ActionListener() {
							public void actionPerformed(ActionEvent e) {
								herramientas.sonidoCorto(sonidos);
								herramientas.usuarioSinIdea(Pantalla);
								sonidos.close();
							}
						});
					}
				});
				//SI DICE QUE NO A LA PREGUNTA 2
				botonNO2.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						herramientas.sonidoCorto(sonidos);
						paises.eliminarSiCumpleLaCaracteristica("norte");
						Pantalla.setVisible(false);
						herramientas.paisElegido(paises.darPais());
						sonidos.close();
					}
				});
				//SI DICE NOSE A LA PREGUNTA 2
				botonNOSE2.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						herramientas.sonidoCorto(sonidos);
						herramientas.usuarioSinIdea(Pantalla);
						sonidos.close();
					}
				});
			}
		});
		//SI DICE QUE NO A LA PREGUNTA 1
		botonNO1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				herramientas.sonidoCorto(sonidos);
				paises.eliminarSiCumpleLaCaracteristica("este");
				herramientas.ponerEnFalsoBotones(botonSI1, botonNO1, botonNOSE1);
				JButton botonSI2=new JButton("SI");
				JButton botonNO2=new JButton("NO");
				JButton botonNOSE2=new JButton("NO SE");
				PaisesenJuego1.setVisible(false);
				//PREGUNTA 2
				herramientas.CargarImagen(imagen1,"imagenes\\756fae1326eec94458c9861d517c23dd.png" ,-30, 67, 252, 460 , Pantalla);
				herramientas.CargarImagen(imagen2,"imagenes\\img-thing (39) - copia - copia.jpg" ,128, 11, 234, 153 , Pantalla);
				herramientas.CargarImagen(imagen3,"imagenes\\norte sur asia.png" ,128, 171, 456, 337 , Pantalla);
				herramientas.crearBoton(botonSI2, 22, 531, 89, 23, Pantalla, Color.CYAN, 16);
				herramientas.crearBoton(botonNO2,243, 533, 89, 23, Pantalla, Color.RED, 16);
				herramientas.crearBoton(botonNOSE2, 458, 528, 89, 23, Pantalla, Color.GREEN, 16);
				JLabel PaisesenJuego2=new JLabel("PAISES POSIBLES:"+paises.CantPaises(paises));
				herramientas.PaisesEnJuego(PaisesenJuego2, Pantalla);
				//SI DICE QUE SI A LA PREGUNTA 2
				botonSI2.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						herramientas.sonidoCorto(sonidos);
						paises.eliminarPorCarac("norte");
						Pantalla.setVisible(false);
						herramientas.paisElegido(paises.darPais());
						sonidos.close();
					}
				});
				//SI DICE QUE NO A LA PREGUNTA 2
				botonNO2.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						herramientas.sonidoCorto(sonidos);
						paises.eliminarSiCumpleLaCaracteristica("norte");
						herramientas.ponerEnFalsoBotones(botonSI2, botonNO2, botonNOSE2);
						JButton botonSI7=new JButton("SI");
						JButton botonNO7=new JButton("NO");
						JButton botonNOSE7=new JButton("NO SE");
						PaisesenJuego2.setVisible(false);
						//PREGUNTA 7
						herramientas.CargarImagen(imagen1,"imagenes\\756fae1326eec94458c9861d517c23dd.png" , -19, 66, 252, 460, Pantalla);
						herramientas.CargarImagen(imagen2,"imagenes\\img-thing (44) - copia - copia.jpg" ,154, 22, 240, 149, Pantalla);
						herramientas.CargarImagen(imagen3,"imagenes\\vaca.jpg" ,253, 252, 331, 197 , Pantalla);
						herramientas.crearBoton(botonSI7, 22, 531, 89, 23, Pantalla, Color.CYAN, 16);
						herramientas.crearBoton(botonNO7,243, 533, 89, 23, Pantalla, Color.RED, 16);
						herramientas.crearBoton(botonNOSE7, 458, 528, 89, 23, Pantalla, Color.GREEN, 16);
						JLabel PaisesenJuego7=new JLabel("PAISES POSIBLES:"+paises.CantPaises(paises));
						herramientas.PaisesEnJuego(PaisesenJuego7, Pantalla);
						//SI DICE QUE SI PREGUNTA 7
						botonSI7.addActionListener(new ActionListener() {
							public void actionPerformed(ActionEvent e) {
								herramientas.sonidoCorto(sonidos);
								paises.eliminarPorCarac("vaca");
								Pantalla.setVisible(false);
								herramientas.paisElegido(paises.darPais());
								sonidos.close();
								}
						});
						//SI DICE QUE NO A LA PREGUNTA 7
						botonNO7.addActionListener(new ActionListener() {
							public void actionPerformed(ActionEvent e) {
								herramientas.sonidoCorto(sonidos);
								paises.eliminarSiCumpleLaCaracteristica("vaca");
								herramientas.ponerEnFalsoBotones(botonSI7, botonNO7, botonNOSE7);
								JButton botonSI8=new JButton("SI");
								JButton botonNO8=new JButton("NO");
								JButton botonNOSE8=new JButton("NO SE");
								PaisesenJuego7.setVisible(false);
								//PREGUNTA 8
								herramientas.CargarImagen(imagen1,"imagenes\\756fae1326eec94458c9861d517c23dd.png" ,0, 62, 252, 460 , Pantalla);
								herramientas.CargarImagen(imagen2,"imagenes\\img-thing (45) - copia - copia.jpg" ,136, 11, 231, 126, Pantalla);
								herramientas.CargarImagen(imagen3,"imagenes\\disfraz-jeque-arabe.jpg" ,210, 62, 374, 476 , Pantalla);
								herramientas.crearBoton(botonSI8, 22, 531, 89, 23, Pantalla, Color.CYAN, 16);
								herramientas.crearBoton(botonNO8,243, 533, 89, 23, Pantalla, Color.RED, 16);
								herramientas.crearBoton(botonNOSE8, 458, 528, 89, 23, Pantalla, Color.GREEN, 16);
								JLabel PaisesenJuego8=new JLabel("PAISES POSIBLES:"+paises.CantPaises(paises));
								herramientas.PaisesEnJuego(PaisesenJuego8, Pantalla);
								//SI DICE QUE SI PREGUNTA 8
								botonSI8.addActionListener(new ActionListener() {
									public void actionPerformed(ActionEvent e) {
										herramientas.sonidoCorto(sonidos);
										paises.eliminarPorCarac("jeque");
										Pantalla.setVisible(false);
										herramientas.paisElegido(paises.darPais());
										sonidos.close();
									}
								});
								//SI DICE QUE NO A PREGUNTA 8
								botonNO8.addActionListener(new ActionListener() {
									public void actionPerformed(ActionEvent e) {
										herramientas.sonidoCorto(sonidos);
										paises.eliminarSiCumpleLaCaracteristica("jeque");
										herramientas.ponerEnFalsoBotones(botonSI8, botonNO8, botonNOSE8);
										JButton botonSI9=new JButton("SI");
										JButton botonNO9=new JButton("NO");
										JButton botonNOSE9=new JButton("NO SE");
										PaisesenJuego8.setVisible(false);
										//PREGUNTA 9
										herramientas.CargarImagen(imagen1,"imagenes\\756fae1326eec94458c9861d517c23dd.png" ,0, 62, 252, 460 , Pantalla);
										herramientas.CargarImagen(imagen2,"imagenes\\img-thing (46) - copia - copia.jpg" ,174, 11, 234, 151 , Pantalla);
										herramientas.CargarImagen(imagen3, "imagenes\\verbos.jpg",262, 262, 342, 200 , Pantalla);
										herramientas.crearBoton(botonSI9, 22, 531, 89, 23, Pantalla, Color.CYAN, 16);
										herramientas.crearBoton(botonNO9,243, 533, 89, 23, Pantalla, Color.RED, 16);
										herramientas.crearBoton(botonNOSE9, 458, 528, 89, 23, Pantalla, Color.GREEN, 16);
										JLabel PaisesenJuego9=new JLabel("PAISES POSIBLES:"+paises.CantPaises(paises));
										herramientas.PaisesEnJuego(PaisesenJuego9, Pantalla);
										//SI DICE QUE SI PREGUNTA 9
										botonSI9.addActionListener(new ActionListener() {
											public void actionPerformed(ActionEvent e) {
												herramientas.sonidoCorto(sonidos);
												paises.eliminarPorCarac("verbo");
												Pantalla.setVisible(false);
												herramientas.paisElegido(paises.darPais());
												sonidos.close();
											}
										});
										//SI DICE QUE NO PREGUNTA 9
										botonNO9.addActionListener(new ActionListener() {
											public void actionPerformed(ActionEvent e) {
												herramientas.sonidoCorto(sonidos);
												paises.eliminarSiCumpleLaCaracteristica("verbo");
												Pantalla.setVisible(false);
												herramientas.paisElegido(paises.darPais());
												sonidos.close();
											}
										});
										//SI DICE NOSE PREGUNTA 9
										botonNO8.addActionListener(new ActionListener() {
											public void actionPerformed(ActionEvent e) {
												herramientas.sonidoCorto(sonidos);
													herramientas.usuarioSinIdea(Pantalla);
													sonidos.close();
											}
										});
									}
								});
								//SI DICE NOSE PREGUNTA 8
								botonNOSE8.addActionListener(new ActionListener() {
									public void actionPerformed(ActionEvent e) {
										herramientas.sonidoCorto(sonidos);
										herramientas.usuarioSinIdea(Pantalla);
										sonidos.close();
									}
								});
							}
						});
						//SI DICE NOSE A LA PREGUNTA 7
						botonNOSE7.addActionListener(new ActionListener() {
							public void actionPerformed(ActionEvent e) {
								herramientas.sonidoCorto( sonidos);
								herramientas.ponerEnFalsoBotones(botonSI7, botonNO7, botonNOSE7);
								JButton botonSI8=new JButton("SI");
								JButton botonNO8=new JButton("NO");
								JButton botonNOSE8=new JButton("NO SE");
								PaisesenJuego7.setVisible(false);
								//PREGUNTA 8
								herramientas.CargarImagen(imagen1,"imagenes\\756fae1326eec94458c9861d517c23dd.png" ,0, 62, 252, 460 , Pantalla);
								herramientas.CargarImagen(imagen2,"imagenes\\img-thing (45) - copia - copia.jpg" ,136, 11, 231, 126, Pantalla);
								herramientas.CargarImagen(imagen3,"imagenes\\disfraz-jeque-arabe.jpg" ,210, 62, 374, 476 , Pantalla);
								herramientas.crearBoton(botonSI8, 22, 531, 89, 23, Pantalla, Color.CYAN, 16);
								herramientas.crearBoton(botonNO8,243, 533, 89, 23, Pantalla, Color.RED, 16);
								herramientas.crearBoton(botonNOSE8, 458, 528, 89, 23, Pantalla, Color.GREEN, 16);
								JLabel PaisesenJuego8=new JLabel("PAISES POSIBLES:"+paises.CantPaises(paises));
								herramientas.PaisesEnJuego(PaisesenJuego8, Pantalla);
								//SI DICE QUE SI PREGUNTA 8
								botonSI8.addActionListener(new ActionListener() {
									public void actionPerformed(ActionEvent e) {
										herramientas.sonidoCorto(sonidos);
										paises.eliminarPorCarac("jeque");
										Pantalla.setVisible(false);
										herramientas.paisElegido(paises.darPais());
										sonidos.close();
									}
								});
								//SI DICE QUE NO A PREGUNTA 8
								botonNO8.addActionListener(new ActionListener() {
									public void actionPerformed(ActionEvent e) {
										herramientas.sonidoCorto(sonidos);
										paises.eliminarSiCumpleLaCaracteristica("jeque");
										herramientas.ponerEnFalsoBotones(botonSI8, botonNO8, botonNOSE8);
										JButton botonSI9=new JButton("SI");
										JButton botonNO9=new JButton("NO");
										JButton botonNOSE9=new JButton("NO SE");
										PaisesenJuego8.setVisible(false);
										//PREGUNTA 9
										herramientas.CargarImagen(imagen1,"imagenes\\756fae1326eec94458c9861d517c23dd.png" ,0, 62, 252, 460 , Pantalla);
										herramientas.CargarImagen(imagen2,"imagenes\\img-thing (46) - copia - copia.jpg" ,174, 11, 234, 151 , Pantalla);
										herramientas.CargarImagen(imagen3, "imagenes\\verbos.jpg",262, 262, 342, 200 , Pantalla);
										herramientas.crearBoton(botonSI9, 22, 531, 89, 23, Pantalla, Color.CYAN, 16);
										herramientas.crearBoton(botonNO9,243, 533, 89, 23, Pantalla, Color.RED, 16);
										herramientas.crearBoton(botonNOSE9, 458, 528, 89, 23, Pantalla, Color.GREEN, 16);
										JLabel PaisesenJuego9=new JLabel("PAISES POSIBLES:"+paises.CantPaises(paises));
										herramientas.PaisesEnJuego(PaisesenJuego9, Pantalla);
										//SI DICE QUE SI PREGUNTA 9
										botonSI9.addActionListener(new ActionListener() {
											public void actionPerformed(ActionEvent e) {
												herramientas.sonidoCorto(sonidos);
												paises.eliminarPorCarac("verbo");
												Pantalla.setVisible(false);
												herramientas.paisElegido(paises.darPais());
												sonidos.close();
											}
										});
										//SI DICE QUE NO PREGUNTA 9
										botonNO9.addActionListener(new ActionListener() {
											public void actionPerformed(ActionEvent e) {
												herramientas.sonidoCorto(sonidos);
												paises.eliminarSiCumpleLaCaracteristica("verbo");
												herramientas.ponerEnFalsoBotones(botonSI9, botonNO9, botonNOSE9);
												JButton botonSI10=new JButton("SI");
												JButton botonNO10=new JButton("NO");
												JButton botonNOSE10=new JButton("NO SE");
												PaisesenJuego9.setVisible(false);
												//PREGUNTA 10
												herramientas.CargarImagen(imagen1,"imagenes\\756fae1326eec94458c9861d517c23dd.png" ,0, 62, 252, 460  , Pantalla);
												herramientas.CargarImagen(imagen2,"imagenes\\img-thing (47) - copia - copia.jpg" ,147, 22, 252, 134 , Pantalla);
												herramientas.CargarImagen(imagen3,"imagenes\\apu.jpg" ,274, 211, 326, 251 , Pantalla);
												herramientas.crearBoton(botonSI10, 22, 531, 89, 23, Pantalla, Color.CYAN, 16);
												herramientas.crearBoton(botonNO10,243, 533, 89, 23, Pantalla, Color.RED, 16);
												herramientas.crearBoton(botonNOSE10, 458, 528, 89, 23, Pantalla, Color.GREEN, 16);
												JLabel PaisesenJuego10=new JLabel("PAISES POSIBLES:"+paises.CantPaises(paises));
												herramientas.PaisesEnJuego(PaisesenJuego10, Pantalla);
												//SI DICE QUE SI PREGUNTA 10
												botonSI10.addActionListener(new ActionListener() {
													public void actionPerformed(ActionEvent e) {
														herramientas.sonidoCorto( sonidos);
														paises.eliminarPorCarac("apu");
														Pantalla.setVisible(false);
														herramientas.paisElegido(paises.darPais());
														sonidos.close();
													}
												});
												//SI DICE QUE NO PREGUNTA 10
												botonNO10.addActionListener(new ActionListener() {
													public void actionPerformed(ActionEvent e) {
														herramientas.sonidoCorto(sonidos);
														paises.eliminarSiCumpleLaCaracteristica("apu");
														Pantalla.setVisible(false);
														herramientas.paisElegido(paises.darPais());
														sonidos.close();
													}
												});
												//SI DICE NOSE PREGUNTA 10
												botonNOSE10.addActionListener(new ActionListener() {
													public void actionPerformed(ActionEvent e) {
														herramientas.sonidoCorto(sonidos);
														herramientas.usuarioSinIdea(Pantalla);
														sonidos.close();
													}
												});
											}
										});
										//SI DICE NOSE PREGUNTA 9
										botonNOSE9.addActionListener(new ActionListener() {
											public void actionPerformed(ActionEvent e) {
												herramientas.sonidoCorto(sonidos);
													herramientas.usuarioSinIdea(Pantalla);
													sonidos.close();
											}
										});
									}
								});
								//SI DICE NOSE PREGUNTA 8
								botonNOSE8.addActionListener(new ActionListener() {
									public void actionPerformed(ActionEvent e) {
										herramientas.sonidoCorto(sonidos);
										herramientas.usuarioSinIdea(Pantalla);
										sonidos.close();
									}
								});
							
								
							}
						});
					}
				});
				//SI DICE NOSE A LA PREGUNTA 2
				botonNOSE2.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						herramientas.sonidoCorto(sonidos);
						herramientas.usuarioSinIdea(Pantalla);
						sonidos.close();
					}
				});
			}
		});
		//SI DICE QUE NOSE A LA PREGUNTA 1
		botonNOSE1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				herramientas.sonidoCorto(sonidos);
				herramientas.usuarioSinIdea(Pantalla);
				sonidos.close();
			}
		});
	}
}
