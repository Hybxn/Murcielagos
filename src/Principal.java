public class Principal {
    public static void main(String[] args) {

        Murcielago m1 = new Murcielago(TipoMurcielago.FRUTA);
        Murcielago m2 = new Murcielago(TipoMurcielago.EGIPCIO, 231);

        System.out.println(m1);
        System.out.println(m2);

        m1 = generar(TipoMurcielago.VAMPIRO);
        System.out.println(m1);

        Murcielago error = new Murcielago(TipoMurcielago.FILIPINO, 1);
        System.out.println(error);
    }

    private static Murcielago generar(TipoMurcielago tipo){
        return new Murcielago(tipo);
    }
}
