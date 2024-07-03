import java.time.LocalDate;
public class Data {
    private int dia;
    private int mes;
    private int ano;

    LocalDate data = LocalDate.now();

    public void dataAtual(){
        setDia(data.getDayOfMonth());
        setMes(data.getMonthValue());
        setAno(data.getYear());
        System.out.println(getDia()+"/"+getMes() +"/"+getAno());
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }
}
