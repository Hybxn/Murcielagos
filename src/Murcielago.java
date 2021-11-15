public class Murcielago {

    private static final int MINPESO = 2;
    private static final int MAXPESO = 1200;
    private static int total = 0;

    private final int numero;
    private TipoMurcielago tipo;
    private int peso;

    public Murcielago(TipoMurcielago tipo) {
        numero = ++total;
        setTipo(tipo);
        peso = pesoRandom();
    }

    public Murcielago(TipoMurcielago tipo, int peso) {
        numero = ++total;
        setTipo(tipo);
        setPeso(peso);
    }

    public int getNumero() {
        return numero;
    }

    private static int pesoRandom() {
        int peso = 0;
        do {
            peso = (int) (Math.random() * MAXPESO - MINPESO);
        } while (peso < MINPESO);
        return peso;
    }

    public TipoMurcielago getTipo() {
        return tipo;
    }

    public void setTipo(TipoMurcielago tipo) {
        this.tipo = tipo;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        if (peso < MINPESO)
            System.err.println("Error el peso debe ser mayor que " + MINPESO);
        else if (peso > MAXPESO)
            System.err.println("Error el peso debe ser menor que " + MAXPESO);
        else
            this.peso = peso;
    }

    public String toString() {

        switch (tipo) {
            case CAFE:
                return String.format("[%d] %s -> Pequeño murcielago cafe (%d gramos).\n",
                        getNumero(), getTipo().name(), getPeso());
            case EGIPCIO:
                return String.format("[%d] %s -> Murcielago egipcio de la fruta (%d gramos).\n",
                        getNumero(), getTipo().name(), getPeso());
            case FILIPINO:
                return String.format("[%d] %s -> Zorro volador filipino (%d gramos).\n",
                        getNumero(), getTipo().name(), getPeso());
            case FRUTA:
                return String.format("[%d] %s -> Murcielago de la fruta (%d gramos).\n",
                        getNumero(), getTipo().name(), getPeso());
            case KITTI:
                return String.format("[%d] %s -> Murcielago nariz de cerdo kitti (%d gramos).\n",
                        getNumero(), getTipo().name(), getPeso());
            case INDIANA:
                return String.format("[%d] %s -> Murcielago de Indiana (%d gramos).\n",
                        getNumero(), getTipo().name(), getPeso());
            case VAMPIRO:
                return String.format("[%d] %s -> Murcielago vampiro (%d gramos).\n",
                        getNumero(), getTipo().name(), getPeso());
        }
        return "null";
    }

    public void comer(int x) {
        if (x > 0)
            setPeso(getPeso() + x);
        else
            System.err.println("Error, no es posible que un mucielago pierda peso al comer.");
    }
}
