public class ProgramaTeste {
    public static void main(String[] args) {
        Praia copacabana = new Praia("Copacabana");
        Voluntario voluntario = new Voluntario("João", "joao@examplo.com");
        Drone drone = new Drone("Drone A1", "dronea1@examplo.com");

        Relatorio relatorio1 = voluntario.reportar(copacabana, "Muito lixo na areia.");
        Relatorio relatorio2 = drone.monitorar(copacabana, "Lixo na água.");

        System.out.println("Relatório 1:");
        System.out.println("Praia: " + relatorio1.getPraia().getNome());
        System.out.println("Descrição: " + relatorio1.getDescricao());
        System.out.println("Responsável: " + relatorio1.getResponsavel().getNome());

        System.out.println("\nRelatório 2:");
        System.out.println("Praia: " + relatorio2.getPraia().getNome());
        System.out.println("Descrição: " + relatorio2.getDescricao());
        System.out.println("Responsável: " + relatorio2.getResponsavel().getNome());
    }
}
