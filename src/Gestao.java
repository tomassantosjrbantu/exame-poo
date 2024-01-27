import java.util.Vector;
import java.time.LocalDate;
import java.time.Period; 
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JOptionPane;

public class Gestao {
	private Machimbombo machimbombo;
	private Administrador administra;
	private Motorista motorista;
	private Passageiro passageiro;
	private Mecanico mecanico;
	private Bilhete bilhete;
	private Validacao via;
	private Encomenda encomenda;
	private Vector<Motorista> motoristas = new Vector<Motorista>();
	private Vector<Passageiro> passageiros = new Vector<Passageiro>();
	private Vector<Mecanico> mecanicos = new Vector<Mecanico>();
	private Vector<Bilhete> bilhetes = new Vector<Bilhete>();
	private Vector<Administrador> administra1 = new Vector<Administrador>();
	private Vector<Machimbombo> autocarros = new Vector<Machimbombo>();
	private Vector<Encomenda> encomendas = new Vector<Encomenda>();
	
	public Gestao(Machimbombo machimbombo, Administrador administra, Motorista motorista, Passageiro passageiro,
			Mecanico mecanico, Bilhete bilhete, Validacao via,Encomenda encomenda, Vector<Motorista> motoristas, Vector<Passageiro> passageiros, Vector<Mecanico> mecanicos, Vector<Bilhete> bilhetes,
			Vector<Machimbombo> autocarros, Vector<Administrador> administra1, Vector<Encomenda> encomendas) {
		super();
		this.machimbombo = machimbombo;
		this.administra = administra;
		this.motorista = motorista;
		this.passageiro = passageiro;
		this.mecanico = mecanico;
		this.bilhete = bilhete;
		this.via = via;
		this.encomenda = encomenda;
		this.motoristas = motoristas;
		this.passageiros = passageiros;
		this.mecanicos = mecanicos;
		this.bilhetes = bilhetes;
		this.autocarros = autocarros;
		this.administra1 = administra1;
		this.encomendas = encomendas;
	}
	 public Gestao() {};	
	
	public int login(int cont) {
		administra = new Administrador("tomassantos@gmail.com", "123456789");
		JOptionPane.showMessageDialog(null, "Email: " + administra.getEmailPessoal() + " e a Senha: " + administra.getSenha());

		administra1.add(administra);
		administra1.trimToSize();
		via = new Validacao();

		Administrador admn = new Administrador(null, null);
		int maxTentativas = 3;
		boolean loginSucesso = false;

		do {
			String email = via.validarString("Digite o seu e-mail:", 11, 30);
			String senha = via.validarString("Digite a senha:", 8, 10);

			for (int i = 0; i < administra1.size(); i++) {
				admn = (Administrador) administra1.elementAt(i);

				if (admn.getEmailPessoal().equalsIgnoreCase(email) && admn.getSenha().equalsIgnoreCase(senha)) {
					loginSucesso = true;
					break;
		            	}
		        	}	

		        	if (loginSucesso) {
		        		JOptionPane.showMessageDialog(null, "Login feito com sucesso!");
		        	} else {
		        		JOptionPane.showMessageDialog(null, "E-mail ou senha n�o encontrados.");
		        		cont++;
		        	}
		    } while (!loginSucesso && cont < maxTentativas);

		    return cont;
	}
	

	 
	
	 
	public void precario() {
		JOptionPane.showInputDialog(null, "==============Precario================== \nTragecto: Maputo-Tete; Preco: 3000Mts; \nTragecto: Beira-Chimoio; Preco: 500Mts; \nTragecto: Maputo-Beira; Preco: 2500Mts \nTragecto: Maputo-Inhambane; Preco: 1500Mts \nNB: Menores de idade pagam 75% do valor mas com acompanhacodo de um aduldo que por sua vez paga 100% do valor.");
		
	}
	
	public void transporte() {
		JOptionPane.showInputDialog(null ,"=================================Dados dos Transportes=================================\n"
				+ "Tragecto: Maputo-Tete; Matricula: AKK 115 MC; Marca: ZHONGTONG; \\nModele: YUNGTONG; \\nMotorista: Basilio Cossa; \\nCor: Preto e Branco\n"
				+ "Tragecto: Beira-Chimoio; \\nMatricula: AKM 101 MC; \\nMarca: ZHONGTONG; \\nModele: YUNGTONG; \\nMotorista: Eduardo Carlos; \\nCor: Cinza e Amarelo "
				+ "\nTragecto: Maputo-Beira; \\nMatricula: AMY 001 MC; \\nMarca: ZHONGTONG; \\nModele: YUNGTONG; \\nMotorista: Alberto Guambe; \\nCor: Laranja e Preto\n"
				+ "Tragecto: Maputo-Inhambane; \\nMatricula: AMD 011 MC; \\nMarca: ZHONGTONG; \\nModele: YUNGTONG; \\nMotorista: Justino Chelton; \\nCor: Verde e Branco");
		
	}
	
	public void adicionarPassageiro() {
		via = new Validacao();
		String nome= via.validarString("NOME DO PASSAGEIRO: ", 3, 30);
        String genero= via.validarString("Genero (M/F)", 1, 1);
        Long telefone = Validacao.validarLong ("Escreva o numero de telefone: ", 820000000 ,879999999);
        Long teleemergencia = Validacao.validarLong ("Escreva o numero de telefone de emergencia: ", 820000000 ,879999999);
		String  dataNasciimento = via.validarString("Qual e a data do nascimento do Passageiro (YYYY-MM-DD)? ", 10, 10);
		LocalDate nascimento=LocalDate.parse(dataNasciimento);
        int idade=(Period.between(nascimento, LocalDate.now())).getYears();
		String dataHoraPartida = via.validarString("Digite a data prevista e hora de saida no formato (yyyy-MM-dd HH:mm): ", 16, 16);
        String dataHoraChegada= via.validarString("Digite a data prevista e hora de chegada no formato (yyyy-MM-dd HH:mm): ", 16, 16);
        String bi= via.validarString("BILHETE DE IDENTIDADE: ", 13, 13);
		String email = via.validarString("Qual e o email do passageiro?", 10, 25);
		LocalDateTime dataHoraAtual = LocalDateTime.now();
        DateTimeFormatter formatador = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        String dataHoraFormatada = dataHoraAtual.format(formatador);
		
		String tragecto = "";
		String modelo = "";
		String matricula = "";
		int preco =0;
		int id = 0;
		String bagagem = "";
		String acompanhante=" ";
        if(idade<18){
            acompanhante= via.validarString("Acompanhante obrigatorio para menores de 18 anos "
            		+ "\nDigite o nome do acompanhante", 3, 30);
            }
        
		int n= via.validarInt("Escolha o tragecto pretendido "
				+ "\n 1.Maputo-Tete "
				+ "\n 2.Beira-Chimoio "
				+ "\n 3.Maputo-Beira "
				+ "\n 4.Maputo-Inhambane", 1, 4);
        
        switch (n){
            case 1:
            	preco= 3000;
            	tragecto= JOptionPane.showInputDialog("Maputo-Tete");
            	matricula = JOptionPane.showInputDialog("AKK 115 MC");
            	modelo = JOptionPane.showInputDialog("ZHONGTONG");
            	id= id+1;
            		break;

            case 2:
            	preco= 500;
            	tragecto= JOptionPane.showInputDialog("Beira-Chimoio");
            	matricula = JOptionPane.showInputDialog("AKM 101 MC");
            	modelo = JOptionPane.showInputDialog("ZHONGTONG");
            	id= id+1;
            		break;

            case 3:
            	preco = 2500;
            	tragecto= JOptionPane.showInputDialog("Maputo-Beira");
            	matricula = JOptionPane.showInputDialog("AMY 001 MC");
            	modelo = JOptionPane.showInputDialog("ZHONGTONG");
            	id= id+1;
            		break;
            
            case 4:
            	preco = 1500;
            	tragecto = JOptionPane.showInputDialog("Maputo-Inhambane");
            	matricula = JOptionPane.showInputDialog("AMD 011 MC");
            	modelo = JOptionPane.showInputDialog("ZHONGTONG");
            	id= id+1;
            		break;

            default:
            	JOptionPane.showMessageDialog(null, "Escolha invalida, escolhe uma opcao valida.");
            }

		passageiro = new Passageiro(nome, idade, telefone, bi, email, genero, dataNasciimento, teleemergencia, bagagem, id, acompanhante);
		passageiros.add(passageiro);
		passageiros.trimToSize();
		bilhete = new Bilhete(preco, dataHoraPartida, dataHoraChegada, idade, dataHoraFormatada);
		bilhetes.add(bilhete);
		bilhetes.trimToSize();
		machimbombo = new Machimbombo(tragecto, modelo, matricula);
		autocarros.add(machimbombo);
		autocarros.trimToSize();
	}
	
	public void cancelarviagem() {
		via = new Validacao();
		int aux = 0;
		int id =  via.validarInt("Digite o ID do seu bilhete: ", 1, 65);
		Passageiro passagerox = new Passageiro("", 0, 0, "", "", "", "", 0, "", 0, "");
		Bilhete bilhetex = new Bilhete(0, "", "", 0, "");
		Machimbombo chapa = new Machimbombo("", "", "");
		
        for (int i=0; i<passageiros.size();i++) {
            passagerox=(Passageiro) passageiros.elementAt(i);
            bilhetex= (Bilhete) bilhetes.elementAt(i);
            chapa = (Machimbombo) autocarros.elementAt(i);
            if(passagerox.getId()==id){
                passageiros.remove(i);
                bilhetes.remove(i);
                bilhetes.trimToSize();
                passageiros.trimToSize();
                autocarros.remove(i);
				autocarros.trimToSize();
				JOptionPane.showMessageDialog(null, "Viagem Cancelada com sucesso!");
                aux=aux+1;
            } else {
                if(aux==0){
                	JOptionPane.showMessageDialog(null, "Passageiro nao encontrado.");
                	}
            }
       }		 
	}
	
	public void visualizarViagem() {
		Passageiro passagerox = new Passageiro("", 0, 0, "", "", "", "", 0, "", 0, "");
		Bilhete bilhetex = new Bilhete(0, "", "", 0, "");
		Machimbombo chapa = new Machimbombo("", "", "");
		
		if(passageiros.size() == 0) {
			JOptionPane.showMessageDialog(null, "Nenhum passageiro cadastrado.");
		}else {
			for(int i = 0; i < passageiros.size(); i++) {
				passagerox = (Passageiro) passageiros.elementAt(i);
				bilhetex =(Bilhete) bilhetes.elementAt(i);
				chapa = (Machimbombo) autocarros.elementAt(i);
				if(bilhetex.getIdade()<18){
					JOptionPane.showMessageDialog(null, "===============Bilhete=============="
							+ "\n===Transportadora T.Investiment's===");
					JOptionPane.showMessageDialog(null, "Nome: " + passagerox.getNome()+ " \nID. Bilhete: "+ passagerox.getId()+ "\nNumero de BI: "+ passagerox.getBi()+ "\nImpresso aos: "+ bilhetex.getDataHoraFormatada()+ "\nEmail do Passageiro: "+ passagerox.getEmail()+
                    "\nPartida: " + bilhetex.getDataHoraPartida() + "\nPrevisao Da Chegada: "+ bilhetex.getDataHoraChegada() + "\nBagagem "+ passagerox.getBagagem()+ "\nPreco: "+ bilhetex.getPreco(i) + 
                    "\nNome do acompanhante: " + passagerox.getAcompanhate() + "\nNumero de telefone do familiar em caso de acidente: " + passagerox.getTeleemergencia() + "\nTransporte Marca: " + chapa.getMarca() + "\nMatricula: " + chapa.getMatricula());
                }
                else{
                	JOptionPane.showMessageDialog(null, "========================Bilhete========================="
							+ "                        \n============Transportadora T.Investiment's==============");
                	JOptionPane.showMessageDialog(null, "Nome: " + passagerox.getNome()+ "\nID. Bilhete: "+ passagerox.getId()+ "\nNumero de BI: "+ passagerox.getBi()+ "\nImpresso aos: "+ bilhetex.getDataHoraFormatada()+ "\nEmail do Passageiro: "+ passagerox.getEmail()+
                    "\nPartida: " + bilhetex.getDataHoraPartida() + "\nBagagem: "+ passagerox.getBagagem() + "\nPrevisao Da Chegada: "+ bilhetex.getDataHoraChegada() + "\nPreco: "+ bilhetex.getPreco(i) + "\nTransporte Marca: " + chapa.getMarca() + "\nMatricula: " + chapa.getMatricula());
                }
			}
		}
	}
	
	public void actualizarDados() {
		via = new Validacao();
		int id = via.validarInt("Digite o ID do registro a ser actualizado: ", 1, 65);
		for (Passageiro passageiro : passageiros) {
	        if (passageiro.getId() == id) {
	            String novoNome = via.validarString("Digite o novo nome do passageiro: ", 3, 30);
	            String novogenero = via.validarString("Digite o gênero do passageiro (M/F): ", 1, 1);
	            Long novotelefone = Validacao.validarLong("Digite o número de telefone do passageiro: ", 820000000, 879999999);
	            Long novoteleemergencia = Validacao.validarLong("Digite o número de telefone de emergência: ", 820000000, 879999999);
	            String novadataNascimento = via.validarString("Digite a data de nascimento do passageiro (YYYY-MM-DD): ", 10, 10);
	            String novobi = via.validarString("Digite o número do BI do passageiro: ", 13, 13);
	          
	            passageiro.setNome(novoNome);
	            passageiro.setGenero(novogenero);
	            passageiro.setTelefone(novotelefone);
	            passageiro.setTeleemergencia(novoteleemergencia);
	            passageiro.setDataNasciimento(novadataNascimento);
	            passageiro.setBi(novobi);
	            JOptionPane.showMessageDialog(null, "Dados do passageiro atualizados com sucesso!");
	            return; 
	        }
	    }
		
		JOptionPane.showMessageDialog(null, "Nenhum registro encontrado com o ID fornecido.");
	}
	
	public void bagagem() {
	    via = new Validacao();
	    int idPassageiro = via.validarInt("Digite o ID do passageiro: ", 1, 65);
	    Passageiro passageiroEncontrado = null;
	    for (Passageiro passageiro : passageiros) {
	        if (passageiro.getId() == idPassageiro) {
	            passageiroEncontrado = passageiro;
	            break;
	        }
	    }

	    if (passageiroEncontrado != null) {
	        String bagagem = via.validarString("Digite a bagagens: ", 0, 25);
	        passageiroEncontrado.setBagagem(bagagem);
	        JOptionPane.showMessageDialog(null, "Bagagens guardadas com sucesso!");
	    } else {
	    	JOptionPane.showMessageDialog(null, "Passageiro não encontrado.");
	    }
	}
	public void salvarPassageirosEmArquivo(String nomeArquivo) {
		   try (BufferedWriter writer = new BufferedWriter(new FileWriter(nomeArquivo))) {
		       for (Passageiro passageiro : passageiros) {
		           writer.write(passageiro.getNome() + "," +
		                    passageiro.getIdade() + "," +
		                    passageiro.getTelefone() + "," +
		                    passageiro.getBi() + "," +
		                    passageiro.getEmail() + "," +
		                    passageiro.getGenero() + "," +
		                    passageiro.getDataNasciimento() + "," +
		                    passageiro.getTeleemergencia() + "," +
		                    passageiro.getBagagem() + "," +
		                    passageiro.getId() + "," +
		                    passageiro.getAcompanhate());
		           writer.newLine();
		       }
		       JOptionPane.showMessageDialog(null, "Dados dos passageiros salvos no arquivo: " + nomeArquivo);
		   } catch (IOException e) {
			   JOptionPane.showMessageDialog(null, "Erro ao salvar dados dos passageiros no arquivo: " + e.getMessage());
		   }
	}
	public void carregarPassageirosDeArquivo(String nomeArquivo) {
		   try (BufferedReader reader = new BufferedReader(new FileReader(nomeArquivo))) {
		       String linha;
		       while ((linha = reader.readLine()) != null) {
		           String[] dados = linha.split(",");
		           String nome = dados[0];
		           int idade = Integer.parseInt(dados[1]);
		           long telefone = Long.parseLong(dados[2]);
		           String bi = dados[3];
		           String email = dados[4];
		           String genero = dados[5];
		           String dataNascimento = dados[6];
		           long teleemergencia = Long.parseLong(dados[7]);
		           String bagagem = dados[8];
		           int id = Integer.parseInt(dados[9]);
		           String acompanhante = dados[10];
		            
		           Passageiro passageiro = new Passageiro(nome, idade, telefone, bi, email, genero, dataNascimento, teleemergencia, bagagem, id, acompanhante);
		           passageiros.add(passageiro);
		       }
		       System.out.println("Dados dos passageiros carregados do arquivo: " + nomeArquivo);
		   } catch (IOException e) {
		       System.out.println("Erro ao carregar dados dos passageiros do arquivo: " + e.getMessage());
		   }
	}
	
	public void enviarEncomenda() {
		via = new Validacao();
	    String destinatario = via.validarString("Digite o nome do destinatario: ", 3, 20);
	    String codigo = via.validarString("Digite o codigo da encomenda: ", 1, 99999);
		String remetente = via.validarString("Digite o nome do remitente: ", 3, 20);
		String conteudo = via.validarString("O que pretende enviar: ", 3, 20);
		encomenda = new Encomenda(destinatario, remetente, codigo, conteudo);
		encomendas.add(encomenda);
		encomendas.trimToSize();
	}
	
	public void receberEncomenda() {
		Encomenda encomendaEncontrada = null;
	    via = new Validacao();
	    String codigo = via.validarString("Digite o codigo da encomenda: ", 1, 99999);
	     
	    for (Encomenda encomenda : encomendas) {
	        if (encomenda.getCodigo().equalsIgnoreCase(codigo)) {
	            encomendaEncontrada = encomenda;
	            break;
	        }
	    }
	    
	    if (encomendaEncontrada != null) {
	        encomendas.remove(encomendaEncontrada);
	        encomendas.trimToSize();
	        JOptionPane.showMessageDialog(null, "Encomenda recebida com sucesso!" +"\nRemetente: "+ encomenda.getRemetente() +"\nDestinatario: "+ encomenda.getDestinatario() +"\nCodigo: "+ encomenda.getCodigo()+ "\nEncomenda: " + encomenda.getConteudo());
	    } else {
	    	JOptionPane.showMessageDialog(null, "Encomenda nao encontrada.");
	    }
	}
	
	public void adicionarMotorista() {
		String nome = "Alberto Guambe";
		int experiencia = 20;
		String marca = "ZHONGTONG";
		String matricula = "AMY 001 MC";
		String modelo = "YUNTONG";
		String bi = "001234567890A";
		int telefone = 847896160;
		String  datanascimento = "1975-05-05";
		String genero = "Masculino";
		String email = "Nao tem";
		String rota = "Maputo-Beira";
		
		machimbombo = new Machimbombo(marca, modelo, matricula);
		autocarros.add(machimbombo);
		autocarros.trimToSize();
		motorista = new Motorista(nome, experiencia, telefone, marca, rota, bi, datanascimento, genero, email, experiencia);
		motoristas.add(motorista);
		motoristas.trimToSize();
		JOptionPane.showMessageDialog(null, "=================================Dados dos Motoristas=================================");
		JOptionPane.showMessageDialog(null, "O nome do motorista eh: " + motorista.getNome() + "\nTem de experiencia: " + motorista.getEsperiencia() +" anos"+ "\nConduz o autocarro da marca: " + machimbombo.getMarca()+ "\nCom placa de descricao: " + machimbombo.getMatricula()+ "\nModelo: " + machimbombo.getModelo() +"\nO Sr." + motorista.getNome() + " foi nascido em: " + motorista.getDataNasciimento()+ "\nGenero: " + motorista.getRota() + "\nEndereco electronico: " +"\nTelefone: " + motorista.getTelefone() + "\nNumero de BI: " +motorista.getGenero() + "\nOpera o tragecto: " + motorista.getEmail());
	
		String nome2 = "Justino Chelton";
		int experiencia2 = 10;
		String marca2 = "ZHONGTONG";
		String matricula2 = "AMD 011 MC";
		String modelo2 = "YUNTONG";
		String bi2 = "001234561520A";
		int telefone2 = 847896209;
		String  datanascimento2 = "1979-04-09";
		String genero2 = "Masculino";
		String email2 = "Nao tem";
		String rota2 = "Maputo-Inhambane";;
		JOptionPane.showMessageDialog(null, "O nome do motorista eh: " + nome2 + "\nTem de experiencia: " + experiencia2 +" anos"+" \nConduz o autocarro da marca: " + marca2 + "\nCom placa de descricao: " + matricula2 + "\nModelo: " + modelo2 + "\nO Sr." + nome2 + " foi nascido em: " + datanascimento2 + "\nGenero: " + genero2 + "\nEndereco electronico: " + email2 + "\nTelefone: " + telefone2 + "\nNumero de BI: " + bi2 + "\nOpera o tragecto: " + rota2);
		
		String nome3 = "Eduardo Carlos";
		int experiencia3 = 15;
		String marca3 = "ZHONGTONG";
		String matricula3 = "AKM 101 MC";
		String modelo3 = "YUNTONG";
		String bi3 = "175234561520A";
		int telefone3 = 841370075;
		String  datanascimento3 = "1991-12-19";
		String genero3 = "Masculino";
		String email3 = "Nao tem";
		String rota3 = "Beira-Chimoio";
		JOptionPane.showMessageDialog(null, "O nome do motorista eh: " + nome3 + "\nTem de experiencia: " + experiencia3 +" anos"+" \nConduz o autocarro da marca: " + marca3 + "\nCom placa de descricao: " + matricula3 + "\nModelo: " + modelo3 + "\nO Sr." + nome3 + " foi nascido em: " + datanascimento3 + "\nGenero: " + genero3 + "\nEndereco electronico: " + email3 + "\nTelefone: " + telefone3 + "\nNumero de BI: " + bi3 + "\nOpera o tragecto: " + rota3);
		
		String nome4 = "Basilio Cossa";
		int experiencia4 = 10;
		String marca4 = "ZHONGTONG";
		String matricula4 = "AKK 115 MC";
		String modelo4 = "YUNTONG";
		String bi4 = "000134561520A";
		int telefone4 = 841370075;
		String  datanascimento4 = "1996-01-19";
		String genero4 = "Masculino";
		String email4 = "Nao tem";
		String rota4 = "Maputo-Tete";
		JOptionPane.showMessageDialog(null, "O nome do motorista eh: " + nome4 + "\nTem de experiencia: " + experiencia4 +" anos"+" \nConduz o autocarro da marca: " + marca4 + "\nCom placa de descricao: " + matricula4 + "\nModelo: " + modelo4 + "\nO Sr." + nome4 + " foi nascido em: " + datanascimento4 + "\nGenero: " + genero4 + "\nEndereco electronico: " + email4 + "\nTelefone: " + telefone4 + "\nNumero de BI: " + bi4 + "\nOpera o tragecto: " + rota4);
	}
	
	public void adicionarMecanico() {
		String nome = "Catu Sequeira";
		String especialidade = "Mecanica Auto"; 
		int experiencia = 26;
		String bi = "001455082854N";
		int telefone = 877916045;
		String  dataNasciimento = "1964-04-09";
		String genero = "Masculino";
		String email = "catusequeira@hotmail.com";
		
		mecanico = new Mecanico(nome, telefone, experiencia, especialidade, bi, email, genero, dataNasciimento, telefone);
		mecanicos.add(mecanico);
		mecanicos.trimToSize();
		JOptionPane.showMessageDialog(null, "=================================Dados dos Motoristas=================================");
		JOptionPane.showMessageDialog(null, "O nome do mecanico eh de: " + mecanico.getNome() + "\nO mecanico tem: " + mecanico.getTelefone() + " anos de experiencia" + "\nEspecializado em: " + mecanico.getBi() + "\nNumero de BI: " + mecanico.getEmail() + "\nNumero de telefone: " + mecanico.getExperiencia() + "\nGenero: " + mecanico.getDataNasciimento() + "\nEndereco electronico: " + mecanico.getGenero());
	}


}
