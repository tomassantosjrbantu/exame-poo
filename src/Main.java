import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Gestao gestao = new Gestao();
			JOptionPane.showMessageDialog(null, "Bem-vindo a Transportadora T.Investiment's!");
			Validacao via = new Validacao();
			int cont = 0;
			int n;
			int encomenda;
			int maxTentativas = 3;
			cont = gestao.login(cont);
			do {
				if (cont >= maxTentativas) {
			        JOptionPane.showMessageDialog(null, "Numero maximo de tentativas excedido. O programa será encerrado.");
			        System.exit(0); 
			    }
				n = via.validarInt("1- Servicos  \n2- Viagens \n3- Passageiro e Bilhete \n4- Encomendas \n5- Sair", 1, 5);
				switch(n) {
				case 1:
					n = via.validarInt("1- Dados Do Motorista  \n2- Dados Do Mecanico \n3- Dados Do Transporte  \n4- Painel Principal", 1, 4);
					switch(n) {
					case 1:
						gestao.adicionarMotorista();
						break;
					case 2:
						gestao.adicionarMecanico();
						break;
					case 3:
						gestao.transporte();
						break;
					case 4:
						//JOptionPane.showMessageDialog(null, "Painel principal");
					default:
						//JOptionPane.showMessageDialog(null, "Opcao invalda.");
						break;
					}
					break;
				case 2:
					n = via.validarInt("1- Cadastrar Passageiro  \n2- Precario Das Viagens \n3- Registrar Bagagem \n4- Painel principal ", 1, 4);
					switch(n) {
					case 1:
						gestao.adicionarPassageiro();
						break;
					case 2:
						gestao.precario();
						break;
					case 3:
						gestao.bagagem();
						break;
					default:
						//JOptionPane.showMessageDialog(null, "Opcao invalda.");
						break;
					}
					break;
				case 3:
					n = via.validarInt("1- Visualizar Bilhete  \n2- Cancelar a viagem \n3- Actualizar Danos \n4- Painel Principal", 1, 4);
					switch(n) {
					case 1:
						gestao.visualizarViagem();
						break;
					case 2:
						gestao.cancelarviagem();
						break;
					case 3:
						gestao.actualizarDados();
						break;
					default:
						//JOptionPane.showMessageDialog(null, "Opcao invalda.");
						break;
					}
					break;
				case 4:
					
					
					encomenda = via.validarInt("1- Enviar Encomenda  \n2- Receber a Encomenda \n3- Painel principal", 1, 3);
					switch(encomenda) {
					case 1:
						gestao.enviarEncomenda();;
						break;
					case 2:
						gestao.receberEncomenda();;
						break;
					case 3:
						//JOptionPane.showMessageDialog(null, "Painel principal");
					default:
						//JOptionPane.showMessageDialog(null, "Opcao invalda.");
						break;
					}
					break;
				case 5:
					JOptionPane.showMessageDialog(null, "Obrigado!!");
					break;
				default:
				}
				
			}while(n != 5);
			gestao.salvarPassageirosEmArquivo("passageiros.txt");
			gestao.carregarPassageirosDeArquivo("passageiros.txt");
			
	}
}
	

