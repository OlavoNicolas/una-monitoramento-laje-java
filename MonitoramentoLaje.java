import java.util.Scanner;

public class MonitoramentoLaje {
    public static void main(String[] args) {
        
    Scanner ls = new Scanner(System.in);
    double cargaProjeto = 15.0;
    double limiteSeguranca = cargaProjeto * 0.8;
    
    System.out.println("---- Sistema SafeBuild: Monitoramento de Carga ----");
    System.out.println("Digite a leitura atual do sensor (kN/m²): ");
    double cargoAtual = ls.nextDouble();

    if (cargoAtual < limiteSeguranca) {
        System.out.println("Status: VERDE");
        System.out.println("Decisão: Operação mensal. Carga dentro dos parâmetros de segurança");        
    
    }else if (cargoAtual>=limiteSeguranca && cargoAtual <= cargaProjeto) {

        System.out.println("Status: AMARELO (ALERTA)");
        System.out.println("Decisão: Reduzir velocidade de concretagem e evacuar pessoal não essêncial");
    }else{

        System.out.println("Status: Vermelho (CRÍTICO)");
        System.out.println("Decisão: Interromper imediatamente! Risco de colapso das escoras");
    }

    if (cargoAtual>(cargoAtual * 1.2)) {
        System.out.println("ALERTA ADICIONAL: Possível falha catastrófica. Evacuar área total!!!");       
    }

    ls.close();

    }
    }
    

