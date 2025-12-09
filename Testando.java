/**
 *
 * @author bruno, pedro e murilo
 */
public class Testando {
  /**
     * 
     * @param nome variavel do tipo string que cadastra o nome do cliente pessoal
     * @param cpf variavel do tipo string que cadastra o cpf do cliente pessoal
     * @param senha  variavel do tipo string que cadastra a senha do cliente pessoal
     * @return retorna um boolean, se for true todos os dados foram cadastrados
     */
    public boolean cadastroCP(String nome, String cpf, String senha ){
        
        boolean validacao = false;
        if(cpf.length()==11 && !nome.equals("") && !senha.equals("")){
            validacao=true;
        }
    return validacao;
        
    }
    /**
     * 
     * @param nome  variavel do tipo string que cadastra o nome do cliente corporativo
     * @param cnpj  variavel do tipo string que cadastra o cnpj do cliente corporativo
     * @param senha  variavel do tipo string que cadastra a senha do cliente corporativo
     * @param limiteCredito variavel do tipo double que cadastra o limite de credito do cliente corporativo
     * @return retorna um boolean, se for true todos os dados foram colocados
     */
    public boolean cadastroCC(String nome, String cnpj, String senha, double limiteCredito ){
        
        boolean validacao = false;
        if(cnpj.length()==14 && !nome.equals("") && !senha.equals("") && limiteCredito !=0){
            validacao=true;
        }
    return validacao;
    
    }
    /**
     * 
     * @param cliente  variavel do tipo string que registra o nome do ciente que esta comprando
     * @param cpf variavel do tipo string que registra o cpf do cliente pessoal
     * @param idProduto  variavel do tipo string que define qual produto foi escolhido e o seu id
     * @param qtdEstoque variavel do tipo inteiro de quantidade de estoque
     * @param qtd variavel do tipo inteira de quantidade que o cliente quer
     * @param nPedido cariavel do tipo String que é o numero do pedido
     * @param precoUnitario variavel do tipo double que define o preco unitario
     * @param total variavel do tipo double que multiplica o precoUnitario com a qtd para achar o total
     * @return retorna uma string que define se foi registrado ou não, para isso vai verificar se tem o produto no estoque, se todos os dados foram completados e verificar se o total esta certo
     */
    public String registroPedidoCP(String cliente,String cpf, String idProduto, int qtdEstoque, int qtd, String nPedido, double precoUnitario, double total){
        String status = "nao registrado";
        
        if(!cliente.equals("") && cpf.length()==11 && !idProduto.equals("") && qtd != 0 && qtdEstoque>=qtd && !nPedido.equals("") && total == precoUnitario * qtd){
            status = "registrado";
        }
        return status; 
    }
    
        
    /**
     * 
     * @param cliente  variavel do tipo string que registra o nome do ciente que esta comprando
     * @param cnpj variavel do tipo string que registra o cnpj do cliente corporativo
     * @param idProduto  variavel do tipo string que define qual produto foi escolhido e o seu id
     * @param qtdEstoque variavel do tipo inteiro de quantidade de estoque
     * @param qtd variavel do tipo inteira de quantidade que o cliente quer
     * @param nPedido cariavel do tipo String que é o numero do pedido
     * @param precoUnitario variavel do tipo double que define o preco unitario
     * @param total variavel do tipo double que multiplica o precoUnitario com a qtd para achar o total
     * @param limiteCredito variavel do tipo double que é o limite de credito do cliente corporativo
     * @return retorna uma string que define se foi registrado ou não, para isso vai verificar se tem o produto no estoque, se todos os dados foram completados, se esta dentro do limite de credito e verificar se o total esta certo
     */
    public String registroPedidoCC(String cliente,String cnpj, String idProduto, int qtdEstoque, int qtd, String nPedido, double precoUnitario, double total, double limiteCredito){
        String status = "nao registrado";
        
        
        if(!cliente.equals("") && cnpj.length()==14 && !idProduto.equals("") && qtd != 0 && qtdEstoque>=qtd && !nPedido.equals("") && total == precoUnitario * qtd && total<= limiteCredito){
            status = "registrado";
        }
        return status; 
    }
    
    /**
     * 
     * @param nome variavel do tipo string que define o nome do produto
     * @param idProduto variavel do tipo string que define o id do produto
     * @param preco variavel do tipo double para o preço do produto
     * @param qtdProduto variavel do tipo inteiro quantidade de produto
     * @return retorna um boolean que se for true o produto foi cadastrado
     */
    public boolean cadastrarProduto(String nome, String idProduto, double preco, int qtdProduto){
        boolean cadastrado = false;
        if(!nome.equals("") && !idProduto.equals("") && preco!= 0 && qtdProduto!=0){
            cadastrado = true;
        }
        return cadastrado;
    }
    
    /**
     * 
     * @param fornNome variavel do tipo string que é o nome do fornecedor
     * @param produto variavel do tipo string que é o nome do produto
     * @param data variavel do tipo string que é a data que foi feito o registro
     * @param qtd variavel do tipo inteiro que é a quantidade comprada
     * @param qtdEstoque variavel do tipo inteiro que é a quantidade de produtos no estoque
     * @param pUnitario variavel do tipo double que é o preço unitario do produto
     * @param total variavel do tipo double que é o total do pUnitario * qtd
     * @return 
     */
    public boolean registroComprasForn(String fornNome, String produto, String data, int qtd, int qtdEstoque, double pUnitario, double total ){
        boolean registro = false;
        if(!fornNome.equals("") && !produto.equals("") && !data.equals("") && qtd!=0 && total==qtd*pUnitario && qtdEstoque>=0){
            registro = true;
        }
        return registro;
    }
    /**
     * 
     * @param cliente variavel do tipo string que é o nome do cliente
     * @param vezesPedida varivavel do tipo int que é a quantidade de vezes pedida, verifica se tiver 3 ou mais pedidos ele é um cliente frequente
     * @param produto variavele do tipo string que é o nome do produto
     * @return retorna um boolean que se for true foi registrado com sucesso
     */
    public boolean clientesFrequentes(String cliente,int vezesPedida, String produto) {
        boolean registro = false;
        if(!cliente.equals("") && vezesPedida >=3 && !produto.equals("")){
            registro = true;
        }
        return registro; 
    }
    
    /**
     * para atualizar a quantidade do estoque de um produto depois da venda
     * @param qtdEstoque variavel do tip inteiro que é a quantidade de produto no estoque atual
     * @param qtdVendida variavel do tipo inteiro que é a quantidade de produtos vendidos
     * @return retorna um valor inteiro que é a subtração da qtdVendida e qtdEstoque
     */
    public int estoqueProdutoAtualizadoVendido( int qtdEstoque, int qtdVendida){
        return qtdEstoque-qtdVendida;
    }
    
    /**
     * para atualizar a quantidade do estoque de um produto depois da venda
     * @param qtdEstoque variavel do tip inteiro que é a quantidade de produto no estoque atual
     * @param qtdComprada variavel do tipo inteiro que é a quantidade de produtos vendidos
     * @return retorna um valor inteiro que é a soma da qtdComprada e qtdEstoque
     */ 
    public int estoqueProdutoAtualizadoComprado( int qtdEstoque, int qtdComprada){
        return qtdEstoque+qtdComprada;
    }
    
    /**
     * 
     * @param usuarioValido variavel do tipo string que é um usario valida
     * @param senhaValida variavel do tipo string que é uma senha valida
     * @param usuario variavel do tipo string que é um usuario que você colocou
     * @param senha variavel do tipo string que é a senha que você colocou
     * @return estorna true se usuarioValido for igual a usuario e senhaValida for igual a senha
     */
    public boolean validacaoLogin(String usuarioValido, String senhaValida, String usuario, String senha){
        boolean status = false;
            if(usuarioValido.equals(usuario) && senhaValida.equals(senha)){
                status=true;
            }
        return status;
    }
    
    /**
     * 
     * @param qtdEstoque variave do tipo int quantidade
     * @param idProduto variavel do tipo String que é o id do produto
     * @return retorna um valor boolean que se for true ele alerta q o estoque esta baixo
     */
    public String alertaEstoque(int qtdEstoque, String idProduto){
        String avisoProduto="ok";
        if (qtdEstoque<=3 && !idProduto.equals("")){
            avisoProduto="estoque baixo";
        }
        return avisoProduto;
    }
  
    /**
     * 
     * @param qtdPedidos variavel do tipo inteiro que é a quantidade de pedidos no mes
     * @param nPedido1 variavel do tipo String que é o numero do pedido 1
     * @param nPedido2 variavel do tipo String que é o numero do pedido 2
     * @param nPedido3 variavel do tipo String que é o numero do pedido 3
     * @param p1 variavel do tipo double que é o preço total do primeiro pedido vendido
     * @param p2 variavel do tipo double que é o preço total do segundo pedido vendido
     * @param p3 variavel do tipo double que é o preço total do terceiro pedido vendido
     * @return retorna "ok" se todos os dados foram completos
     */
    public String relMensalVendas(int qtdPedidos, String nPedido1, String nPedido2, String nPedido3, double p1, double p2, double p3){
        String status = "errado";
        if(qtdPedidos!=0 && !nPedido1.equals("") && !nPedido2.equals("") && !nPedido3.equals("") && p1!=0 && p2!=0 && p3!=0){
            status="ok";
        }
        
        return status;
    }
    /**
     * verifica se o calulo do total esta certo
     * @param p1 variavel do tipo double que é o preço total do primeiro pedido vendido
     * @param p2 variavel do tipo double que é o preço total do segundo pedido vendido
     * @param p3 variavel do tipo double que é o preço total do terceiro pedido vendido
     * @return retorna a soma do p1, p2 , p3 que é o total
     */
    public double calculoTotalVendasMensal(double p1, double p2, double p3){
        return p1+p2+p3;
    }
      /**
     * 
     * @param qtdProdutos variavel do tipo inteiro que retorna a quantidade de produtos do pedido 
     * @param nPedido     variavel do tipo inteiro que retorna a identidicação do pedido
     * @param idProduto1  variavel do tipo string que retorna a identificação do primeiro produto
     * @param idProduto2  variavel do tipo string que retorna a identificação do segundo produto
     * @param idProduto3  variavel do tipo string que retorna a identificação do terceiro produto
     * @return 
     */
    public String validaPedido (int qtdProdutos,String nPedido, String idProduto1, String idProduto2, String idProduto3){
        String status = "errado";
        if(qtdProdutos == 3 && !nPedido.equals("") && !idProduto1.equals("") && !idProduto2.equals("") && !idProduto3.equals("")){
            status="ok";}
        return status;
    }
        /**
         * 
         * @param total variavel do tipo double que retorna o valor total do pedido 
         * @param preco1 variavel do tipo double que retorna o preço do primeiro produto
         * @param preco2 variavel do tipo double que retorna o preço do segundo produto
         * @param preco3 variavel do tipo double que retorna o preço do terceiro produto
         * @return 
         */
    public boolean calculoAutomatico (double total,double preco1, double preco2, double preco3){
        boolean status = false;
        if(total==preco1+preco2+preco3){
            status = true;
        }
        return status;
    }
    /**
     * 
     * @param valor variavel do tipo double que retorna o valor inserido em double
     * @param valorConvertido variavel do tipo int que retorna a conversao do valor em double para inteiro
     * @return 
     */
    public String arredondamentoCalculoAutomatico (double valor, int valorConvertido){
        String status = "erro";
        valorConvertido = (int) valor;
        if (valor == (double) valorConvertido) {
        status = "ok";
        }
         return status;
    }
    /**
     * 
     * @param nome variavel do tipo string que cadastra o nome inserido
     * @param cnpj variavel do tipo string que cadastra o numero do cpnj
     * @param senha variavel do tipo string que cadastra a senha de usuario
     * @return 
     */
    public String cadastroForn(String nome, String cnpj, String senha){
        String validacao = "erro";
        if(cnpj.length()==14 && !nome.equals("") && !senha.equals("")){
            validacao="ok";
        }
    return validacao;
    }
      /**
     * 
     * @param cnpj variavel do tipo String que pega o cnpj
     * @return retorna um valor String de "ok" se a condição do if estiver certo ou "erro" se a condição não estivar certo
     */
    public String duplicCNPJ (String cnpj){
        String validacao = "erro";
        if (!cnpj.equals("12355678910")){
            validacao = "ok";
        }
    return validacao;
    }
    /**
     * 
     * @param nome1 variavel do tipo String que representa o nome antes da atualização
     * @param nome2 variavel do tipo String que representa o nome depois da atualização
     * @param cnpj1 variavel do tipo double que repreesenta o cnpj antes da atualização
     * @param cnpj2 variavel do tipo double que representa o cnpj depois da atualização
     * @return 
     */
    public boolean atualizarFornecedor(String nome1, String nome2, String cnpj1, String cnpj2){
        boolean status = false;
        if (!nome2.equals(nome1) || !cnpj1.equals(cnpj2)){
            status = true;
        }
        return status;
    }
    /**
     * 
     * @param produto1 variavel do tipo String que representa o produto relacionado ao valor1
     * @param produto2 variavel do tipo String  que representa o produto relacionado ao valor2
     * @param valorProduto1 variavel do tipo double que representa o valor relacionado ao produto1
     * @param valorProduto2 variavel do tipo double que representa o valro relacionado ao produto2
     * @return 
     */
    public double ProdutoMaisVendido(String produto1,String produto2, double valorProduto1, double valorProduto2){
        double maisVendido;
        if(valorProduto1>valorProduto2){
            maisVendido = valorProduto1;
        } else{
            maisVendido = valorProduto2;
        }
        return maisVendido;
    }
    /**
     * 
     * @param statusPendente variavel do tipo String que representa o status de envio "Pendente"
     * @param statusEnviado variavel do tipo String que representa o stataus de envio "Enviado"
     * 
     * @return 
     */
    public String statusProduto (String statusPendente, String statusEnviado){
        String status = statusPendente;
        String condicao = "Enviado";
        if(condicao.equals("Enviado")){
        status = statusEnviado;
        } else {
            status = statusPendente;
                    }
        return status;
    }
    /**
     * 
     * @param filtroDisp
     * @param filtroIndisp
     * @return 
     */
    public String visualizarPedidosFiltro (String filtroDisp, String filtroIndisp){
        String status = filtroIndisp;
        if(!status.equals(filtroIndisp)){
            status = filtroDisp;
        } else {
            status = filtroDisp;
        }
        return status;
    }
    /**
     * 
     * @param entregue
     * @param disponivel
     * @param indisponivel
     * @return 
     */
    public String alterarEntregue (String entregue, String disponivel, String indisponivel){
        String status = entregue;
        if(!status.equals(entregue)){
            status = disponivel;
        }else {
            status.equals(disponivel);
        }
        return status;
    }
    public String pesquisaCliente (String cliente1, String cliente2, String cliente3){
        String nome = cliente1;
        return nome;
    }
}
