package EncapsulationExample;

public class BoxVol {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Box box1 =new Box();
        int vol;
        box1.setHeight(15);
        box1.setLength(18);
        box1.setWidth(8);
        vol=box1.displayVolume();
        System.out.println("Volume is = "+vol);
	}

}
