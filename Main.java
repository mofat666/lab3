import javax.swing.JApplet;

public class Main extends JApplet {

    public void init()
    {


        Vector2D wektor1=new Vector2D(5,3);
        Vector2D wektor2=new Vector2D(12,18);
        System.out.println("Współrzędne wektora nr.1 : ["+wektor1.x+"]["+wektor1.y+"]");
        System.out.println("Współrzędne wektora nr.2 : ["+wektor2.x+"]["+wektor2.y+"]");


        Vector2D suma=new Vector2D(); //suma wektorów
        suma=wektor1.sumaWektorow(wektor2);
        System.out.println("Suma wektorów: ["+suma.x+"]["+suma.y+"]");

        Vector2D roznica=new Vector2D(); //różnica wektorów
        roznica=wektor1.roznicaWektorow(wektor2);
        System.out.println("Różnica wektorów: ["+roznica.x+"]["+roznica.y+"]");

        Vector2D znormalizowany1=new Vector2D();
        System.out.println("Wektor znormalizowany nr.1: ["+znormalizowany1.x+"]["+znormalizowany1.y+"]");

        Vector2D znormalizowany2=new Vector2D(); //wartość wektora znormalizowanego
        znormalizowany2=wektor2.wektorNorm();
        System.out.println("Wektor znormalizowany nr.2: ["+znormalizowany2.x+"]["+znormalizowany2.y+"]");

        double dlugosc1=wektor1.dlugoscWektora();
        System.out.println("Długość wektora nr. 1: ["+dlugosc1+"]");
        double dlugosc2=wektor2.dlugoscWektora();
        System.out.println("Długość wektora nr. 2: ["+dlugosc2+"]");

        Vector2D mnozenie=new Vector2D();  //wektor * stała
        mnozenie=wektor1.mnozenieWektora();
        System.out.println("Wartość wektora * stała: ["+mnozenie.x+"]["+mnozenie.y+"]"); //wyświetlenie obliczonych wartości

    }
    }
    public void paint(){
    }


