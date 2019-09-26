package Modelo;

import java.util.ArrayList;

public class PaisesDelJuego {
	public ArrayList<pais> paises;
	
	
	public PaisesDelJuego(){
	//PAISES DE AMERICA DEL SUR
	paises=new ArrayList<pais>();
	pais p1 =new pais();
	p1.nombre="Argentina";
	p1.continente="Sur America";
	p1.carac1="mar";
	p1.carac2="mundial";
	p1.carac3="sol";
	p1.carac4="messi";
	paises.add(p1);
	pais p2 =new pais();
	p2.nombre="Chile";
	p2.continente="Sur America";
	p2.carac1="mar";
	p2.carac2="no mundial";
	p2.carac3="pacifico";
	p2.carac4="terremoto";
	paises.add(p2);
	pais p3 =new pais();
	p3.nombre="Uruguay";
	p3.continente="Sur America";
	p3.carac1="mar";
	p3.carac2="mundial";
	p3.carac3="sol";
	paises.add(p3);
	pais p4 =new pais();
	p4.nombre="Paraguay";
	p4.continente="Sur America";
	p4.carac1="no mar";
	p4.carac2="asuncion";
	paises.add(p4);
	pais p5 =new pais();
	p5.nombre="Brasil";
	p5.continente="Sur America";
	p5.carac1="mar";
	p5.carac2="mundial";
	paises.add(p5);
	pais p6 =new pais();
	p6.nombre="Bolivia";
	p6.continente="Sur America";
	p6.carac1="no mar";
	p6.carac2="b";
	paises.add(p6);
	pais p7 =new pais();
	p7.nombre="Peru";
	p7.continente="Sur America";
	p7.carac1="mar";
	p7.carac2="no mundial";
	p7.carac3="pacifico";
	p7.carac4="4";
	paises.add(p7);
	pais p8=new pais();
	p8.nombre="Ecuador";
	p8.continente="Sur America";
	p8.carac1="mar";
	p8.carac2="no mundial";
	p8.carac3="pacifico";
	paises.add(p8);
	pais p9 =new pais();
	p9.nombre="Colombia";
	p9.continente="Sur America";
	p9.carac1="mar";
	p9.carac2="no mundial";
	p9.carac3="pacifico";
	p9.carac4="Pablo Escobar";
	paises.add(p9);
	pais p10 =new pais();
	p10.nombre="Venezuela";
	p10.continente="Sur America";
	p10.carac1="mar";
	p10.carac2="no mundial";
	paises.add(p10);
	
	
	//PAISES DE AMERICA DEL NORTE
	
	pais p11 =new pais();
	p11.nombre="Mexico";
	p11.continente="Norte America";
	p11.carac1="español";
	paises.add(p11);
	pais p12 =new pais();
	p12.nombre="Estados Unidos";
	p12.continente="Norte America";
	p12.carac1="Trump";
	paises.add(p12);
	pais p13 =new pais();
	p13.nombre="Canada";
	p13.continente="Norte America";
	paises.add(p13);
	
	//PAISES DE EUROPA
	
	pais p14 =new pais();
	p14.nombre="Portugal";
	p14.continente="Europa";
	p14.carac1="portugues";
	p14.carac2="oeste";
	paises.add(p14);
	pais p15 =new pais();
	p15.nombre="España";
	p15.continente="Europa";
	p15.carac1="sur";
	p15.carac2="oeste";
	paises.add(p15);
	pais p16 =new pais();
	p16.nombre="Francia";
	p16.continente="Europa";
	p16.carac1="torre";
	p16.carac2="oeste";
	paises.add(p16);
	pais p17 =new pais();
	p17.nombre="Reino Unido";
	p17.continente="Europa";
	p17.carac1="norte";
	p17.carac2="oeste";
	p17.carac3="malvinas";
	paises.add(p17);
	pais p18 =new pais();
	p18.nombre="Paises Bajos";
	p18.continente="Europa";
	p18.carac1="norte";
	p18.carac2="oeste";
	p18.carac3="reina";
	paises.add(p18);
	pais p19 =new pais();
	p19.nombre="Alemania";
	p19.continente="Europa";
	p19.carac1="norte";
	p19.carac2="hitler";
	paises.add(p19);
	pais p20 =new pais();
	p20.nombre="Italia";
	p20.continente="Europa";
	p20.carac1="vaticano";
	paises.add(p20);
	pais p21 =new pais();
	p21.nombre="Polonia";
	p21.continente="Europa";
	p21.carac1="norte";
	p21.carac2="p";
	paises.add(p21);
	pais p22 =new pais();
	p22.nombre="Suecia";
	p22.continente="Europa";
	p22.carac1="norte";
	p22.carac2="estocolmo";
	paises.add(p22);
	pais p23 =new pais();
	p23.nombre="Finlandia";
	p23.continente="Europa";
	p23.carac1="norte";
	p23.carac2="queso";
	paises.add(p23);
	pais p24 =new pais();
	p24.nombre="Grecia";
	p24.continente="Europa";
	paises.add(p24);
	pais p25=new pais();
	p25.nombre="Irlanda";
	p25.continente="Europa";
	p25.carac1="norte";
	p25.carac2="oeste";
	p25.carac3="duende";
	paises.add(p25);
	
	//PAISES DE OCEANIA
	
	pais p26 =new pais();
	p26.nombre="Nueva Guinea";
	p26.continente="Oceania";
	p26.carac1="ave";
	p26.carac3="2 palabras";
	paises.add(p26);
	pais p27 =new pais();
	p27.nombre="Australia";
	p27.continente="Oceania";
	p27.carac1="canguro";
	paises.add(p27);
	pais p28 =new pais();
	p28.nombre="Nueva Zelanda";
	p28.continente="Oceania";
	p28.carac1="rugby";
	p28.carac2="z";
	p28.carac3="2 palabras";
	paises.add(p28);
	
	//PAISES DE AFRICA
	
	pais p29 =new pais();
	p29.nombre="Marruecos";
	p29.carac1="marP";
	p29.carac2="bandera1";
	p29.continente="Africa";
	paises.add(p29);
	pais p30 =new pais();
	p3.nombre="Algeria";
	p30.continente="Africa";
	p30.carac1="marM";
	p30.carac2="banderaE";
	p30.carac3="argel";
	paises.add(p30);
	pais p31 =new pais();
	p31.nombre="Libia";
	p31.continente="Africa";
	p31.carac1="marM";
	p31.carac2="banderaE";
	paises.add(p31);
	pais p32 =new pais();
	p32.nombre="Egipto";
	p32.continente="Africa";
	p32.carac1="marM";
	p32.carac3="piramide";
	paises.add(p32);
	pais p33 =new pais();
	p33.nombre="Sudan";
	p33.continente="Africa";
	p33.carac1="marM";
	paises.add(p33);
	pais p34 =new pais();
	p34.nombre="Nigeria";
	p34.continente="Africa";
	p34.carac2="bandera2"; 
	paises.add(p34);
	pais p35 =new pais();
	p35.nombre="Camerun";
	p35.carac2="banderaE"; //estrella
	p35.carac3="Eto";
	p35.continente="Africa";
	paises.add(p35);
	pais p36 =new pais();
	p36.nombre="Republica Africana Central";
	p36.carac2="banderaE"; //estrella
	p36.continente="Africa";
	paises.add(p36);
	pais p37 =new pais();
	p37.nombre="Somalia";
	p37.continente="Africa";
	p37.carac2="banderaE";
	p37.carac3="desnutricion";
	paises.add(p37);
	pais p38 =new pais();
	p38.nombre="Angola";
	p38.carac2="banderaE";
	p38.carac3="anguila"; 
	p38.continente="Africa";
	paises.add(p38);

	
	//PAISES DE ASIA
	
	pais p39 =new pais();
	p39.nombre="Arabia Saudita";
	p39.continente="Asia";
	p39.carac1="jeque";
	paises.add(p39);
	pais p40 =new pais();
	p40.nombre="Iran";
	p40.continente="Asia";
	p40.carac1="verbo";
	paises.add(p40);
	pais p41 =new pais();
	p41.nombre="Kazahistan";
	p41.continente="Asia";
	p41.carac2="norte";
	paises.add(p41);
	pais p42 =new pais();
	p42.nombre="Pakistan";
	p42.continente="Asia";
	paises.add(p42);
	pais p43 =new pais();
	p43.nombre="India";
	p43.continente="Asia";
	p43.carac1="vaca";
	p43.carac2="apu";
	paises.add(p43);
	pais p44 =new pais();
	p44.nombre="China";
	p44.continente="Asia";
	p44.carac1="este";
	p44.carac2="norte";
	p44.carac3="grande";
	paises.add(p44);
	pais p45 =new pais();
	p45.nombre="Tailandia";
	p45.continente="Asia";
	p45.carac1="este";
	paises.add(p45);
	pais p46 =new pais();
	p46.nombre="Corea Del Norte";
	p46.continente="Asia";
	p46.carac1="este";
	p46.carac2="norte";
	p46.carac3="korea";
	paises.add(p46);
	pais p47 =new pais();
	p47.nombre="Corea Del Sur";
	p47.continente="Asia";
	p47.carac1="este";
	p47.carac2="norte";
	p47.carac3="korea";
	p47.carac4="sur";
	paises.add(p47);
	pais p48 =new pais();
	p48.nombre="Japon";
	p48.continente="Asia";
	p48.carac1="este";
	p48.carac2="norte";
	p48.carac3="tecnologia";
	paises.add(p48);
}
	
	public void eliminarPorContinente(String continente) {
		for(int i=0;i<paises.size();i++) {
			if(paises.get(i).continente!=continente) {
				paises.remove(i);
				i=i-1;
			}
			}
	}
	private boolean CumpleCaracteristica(String caracteristica ,pais pais){
		if(pais.carac1==caracteristica||pais.carac2==caracteristica||pais.carac3==caracteristica||pais.carac4==caracteristica) {
			return true;
		}
		return false;
	}
	public void eliminarPorCarac(String caracteristicas) {
		for(int i=0;i<paises.size();i++) {
			if(!CumpleCaracteristica(caracteristicas,paises.get(i))){
				paises.remove(i);
				i=i-1;
			}
			}
	}
	public void eliminarSiCumpleLaCaracteristica(String caracteristicas) {
		for(int i=0;i<paises.size();i++) {
			if(CumpleCaracteristica(caracteristicas,paises.get(i))){
				paises.remove(i);
				i=i-1;
			}
			}
	}
	public String darPais() {
		if(paises.size()==1) {
			return paises.get(0).nombre;
		}
		throw new RuntimeException("no hay paises que mostrar");
	}
	public int CantPaises(PaisesDelJuego paises) {
		return paises.paises.size();
	}
	}



