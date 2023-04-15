/*
Realizar un programa en Java donde se creen dos arreglos: el primero será un arreglo A
de 50 números reales, y el segundo B, un arreglo de 20 números, también reales. El
programa deberá inicializar el arreglo A con números aleatorios y mostrarlo por pantalla.
Luego, el arreglo A se debe ordenar de menor a mayor y copiar los primeros 10 números
ordenados al arreglo B de 20 elementos, y rellenar los 10 últimos elementos con el valor
0.5. Mostrar los dos arreglos resultantes: el ordenado de 50 elementos y el combinado de
20
 */
package arreglosapp.arreglos;

public class Arreglo {

    public double[] a = new double[50];
    public double[] b = new double[20];

    public Arreglo() {
    }

    public double[] getA() {
        return a;
    }

    public void setA(double[] a) {
        this.a = a;
    }

    public double[] getB() {
        return b;
    }

    public void setB(double[] b) {
        this.b = b;
    }
/*
    Metodo para rellenar vector a con numeros random.
    */
    public void a() {

        for (int i = 0; i < a.length; i++) {
            a[i] = (Math.random() * 100);
            System.out.print(a[i] + " | ");
        }

    }
/*
    Metodo para rellenar vector b con numeros random.
    */
    public void b() {

        for (int i = 0; i < b.length; i++) {
            b[i] = (Math.random() * 100 );
            System.out.print(b[i] + " | ");
        }

    }
}
