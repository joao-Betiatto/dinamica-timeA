class Data {
    private int dia;
    private int mes;
    private int ano;
    private String hora = "14:20";

    public void mostrarData() {

          System.out.println(this.dia+"/"+this.mes+"/"+this.ano);
          System.out.println(this.hora+" horas\n");
    }

    public void setData(int dia, int mes, int ano, String hora) {

        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
        this.hora = hora;
    }
}