
public class Vector2D {
    public double x, y, k=5;

    public Vector2D(){	//konstruktor domyœlny
    }
    public Vector2D(double x, double y){  //konstruktor z parametrami
        this.x=x;
        this.y=y;
    }
    public Vector2D sumaWektorow(Vector2D x1){ //metoda z parametrem zwracająca obiekt
        Vector2D wektor = new Vector2D(x + x1.x,y + x1.y);
        return wektor;
    }
    public Vector2D roznicaWektorow(Vector2D  x1){  //metoda z parametrem zwracająca obiekt
        Vector2D wektor = new Vector2D(x - x1.x,y - x1.y);
        return wektor;
    }
    public Vector2D mnozenieWektora(){  //wektor pomnożoony przez stałą

        Vector2D wektor = new Vector2D(x*k,y*k);
        return wektor;
    }
    public double dlugoscWektora(){ //metoda zwracająca długość wektora
        return Math.sqrt(x*x+y*y);
    }
    public Vector2D wektorNorm(){  //metoda zwracająca znormalizowany wketor

        double x2;
        double y2;
        x2=x/(Math.sqrt(x*x+y*y));
        y2=y/(Math.sqrt(x*x+y*y));
        Vector2D wektor = new Vector2D(x2, y2);
        return wektor;
    }
}

