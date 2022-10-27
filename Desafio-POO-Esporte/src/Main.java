import br.com.dio.desafio.dominio.Atleta;
import br.com.dio.desafio.dominio.Futebol;
import br.com.dio.desafio.dominio.Skate;
import br.com.dio.desafio.dominio.TreinamentoEsportivo;

public class Main {
    public static void main(String[] args) {

        Futebol futebolFeminino = new Futebol();
        futebolFeminino.setCategoria("Futsal");
        futebolFeminino.setQuantidadeDeJogadores(5);
        futebolFeminino.setTempo(10);
        futebolFeminino.setLance("Gol Olimpico");
        System.out.println(futebolFeminino);

        Skate skatePark = new Skate();
        skatePark.setCategoria("Park");
        skatePark.setQuantidadeDeJogadores(1);
        skatePark.setTempo(45);
        skatePark.setManobra("Ollie");
        System.out.println(skatePark);

        TreinamentoEsportivo treinamentoEsportivo = new TreinamentoEsportivo();
        treinamentoEsportivo.setNome("Flexibilidade");
        treinamentoEsportivo.setDescricao("consiste na realização de alongamentos corporais com o objetivo de aumentar o comprimento muscular e de preparar o músculo para o exercício físico");
        treinamentoEsportivo.getEsporte().add(futebolFeminino);
        treinamentoEsportivo.getEsporte().add(skatePark);

        Atleta atletaFutebol = new Atleta();
        atletaFutebol.setNome("Marta");
        atletaFutebol.inscreverTreinamentoEsportivo(treinamentoEsportivo);
        System.out.println("Esporte Inscritos Marta:" + atletaFutebol.getEsporteInscrito());
        atletaFutebol.progredir();
        System.out.println("-----------");
        System.out.println("Esporte Inscritos Marta:" + atletaFutebol.getEsporteInscrito());
        System.out.println("Esporte Concluidos Marta:" + atletaFutebol.getEsporteConcluidos());
        System.out.println("XP:" + atletaFutebol.calcularTotalXP());

        Atleta atletaSkate = new Atleta();
        atletaSkate.setNome("Leticia Buffoni");
        atletaSkate.inscreverTreinamentoEsportivo(treinamentoEsportivo);
        atletaSkate.progredir();
        atletaSkate.progredir();
        System.out.println("-----------");
        System.out.println("Esporte Inscritos Leticia Buffoni:" + atletaSkate.getEsporteInscrito());
        System.out.println("Esporte Concluidos Leticia Buffoni:" + atletaSkate.getEsporteConcluidos());
        System.out.println("XP:" + atletaSkate.calcularTotalXP());
    }
}
