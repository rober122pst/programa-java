import java.util.Scanner;

public class Sidney
{
	public static void main(String[] args) {
	    boolean termina = false;
	    
		Scanner scanner = new Scanner(System.in);
        String[] quartoN = new String[21];
        
        for(int i = 1; i <= 20; i++) {
            quartoN[i] = "Livre";
        }
        System.out.println("######################################################");
        System.out.println("###########╔═══╗╔══╗╔═══╗╔═╗─╔╗╔═══╗╔╗──╔╗############");
        System.out.println("###########║╔═╗║╚╗╔╝╚╗╔╗║║║╚╗║║║╔══╝║╚╗╔╝║############");
        System.out.println("###########║╚══╗─║║──║║║║║╔╗╚╝║║╚══╗╚╗╚╝╔╝############");
        System.out.println("###########╚══╗║─║║──║║║║║║╚╗║║║╔══╝─╚╗╔╝─############");
        System.out.println("###########║╚═╝║╔╝╚╗╔╝╚╝║║║─║║║║╚══╗──║║──############");
        System.out.println("###########╚═══╝╚══╝╚═══╝╚╝─╚═╝╚═══╝──╚╝──############");
        System.out.println("######################################################\n");
        while(!termina)
        {
            System.out.println("Por favor, insira o número do quarto. (1-20)");
            int quarto;
            while (true) {
                try {
                    quarto = Integer.parseInt(scanner.nextLine());
                    if(quarto > 20 || quarto < 1){
                        System.out.println("Este quarto não existe, tente novamente.");
                    }else{
                        break;
                    }
                } catch (NumberFormatException e) {
                    System.out.println("Número inválido, insira novamente.");
                }
            }
            System.out.println("Este quarto está livre ou ocupado? (L/O)");
            String resposta1;
            while(true){
                resposta1 = scanner.nextLine();
                if(resposta1.equals("L"))
                {
                    for(int i = 1; i <= 20; i++){
                        if(i == quarto){
                            quartoN[i] = "Livre";
                            System.out.println("Quarto livre.");
                        }
                    }
                    break;
                }else if(resposta1.equals("O"))
                {
                    for(int i = 1; i <= 20; i++){
                        if(i == quarto){
                            if(quartoN[i] == "Livre")
                            {
                                quartoN[i] = "Ocupado";
                                System.out.println("Quarto Ocupado.");
                            }else {
                                System.out.println("Este quarto já está ocupado.");
                            }
                        }
                    }
                    break;
                }else{
                    System.out.println("Resposta Inválida. Tente novamente.");
                }
            }
            System.out.println("Deseja Continuar? (S/N)");
            String resposta2;
            while(true)
            {
                resposta2 = scanner.nextLine();
                if(resposta2.equals("S"))
                {
                    System.out.println("\n------------------------------------------------------\n");
                    break;
                }else if(resposta2.equals("N"))
                {
                    System.out.println("\n------------------------------------------------------\n");
                    for(int i = 1; i <= 20; i++) {
                        System.out.println("Quarto "+i+" "+quartoN[i]);
                    }
                    System.out.println("------------------------------------------------------\n");
                    System.out.println("Programa finalizado.");
                    System.exit(0);
                    break;
                }else
                {
                    System.out.println("Resposta inválida. Tente novamente.");
                }
            }
        }
	}
}

