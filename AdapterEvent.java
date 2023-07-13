package day0713;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class AdapterEvent extends WindowAdapter{
	private AdapterDesign ad;
	public AdapterEvent (AdapterDesign ad) {
		this.ad=ad;
		
	}
	/**
	 * Xxx adapter 클래스를 상속받아 Override할 method를 최소화 할 수 있다.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {

	}

	@Override
	public void windowClosing(WindowEvent e) {
		
		
		
	ad.dispose();
	}

}
