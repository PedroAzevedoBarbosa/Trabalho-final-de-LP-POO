Sistema de Vendas em Java 🛒

Este é um projeto de implementação de um sistema de vendas em Java.
O sistema permite que os usuários visualizem uma vitrine de produtos, adicionem itens ao carrinho, visualizem o carrinho, realizem o pagamento e efetuem o logout.

Funcionalidades:
Tela de Vitrine de Produtos 🛍️:
Exibe uma grade de produtos disponíveis para venda.
Cada produto é representado por  nome e opção para adicionar ao carrinho.
Os produtos são carregados a partir de um estoque pré-definido.

Adição de Produtos ao Carrinho ➕:
Os usuários podem selecionar produtos na vitrine e adicionar ao carrinho.

Tela do Carrinho 🛒:
Exibe todos os itens atualmente no carrinho, incluindo nome, e quantidade e subtotal de cada item.
Permite que os usuários visualizem o total do carrinho.

Pagamento 💳:
Ao prosseguir para o pagamento, os usuários são redirecionados para uma tela de pagamento onde podem inserir suas informações de pagamento.
Após o pagamento ser concluído com sucesso, o carrinho é esvaziado e uma mensagem de confirmação é exibida.

Funcionamento do Código 💻:
O sistema é composto por várias classes Java que se comunicam para fornecer funcionalidades específicas.
As classes principais incluem TelaPrincipal, TelaCarrinho, TelaPagamento, TelaLogin, Carrinho, Estoque, Produto e ItemVenda.
O código faz uso extensivo do pacote javax.swing para criar a interface gráfica do usuário.
O estoque de produtos é carregado a partir de um arquivo de dados.
As interações do usuário são tratadas por meio de ActionListeners associados a botões e outros componentes de interface.

https://github.com/PedroAzevedoBarbosa/Trabalho-final-de-LP-POO/blob/main/Trabalho-final-de-LP-POO/tela%20login.png
