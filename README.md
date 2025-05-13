🧾 Documentação - Sistema de Controle de Consultas Médicas
O que é esse sistema?
Este é um programinha feito em Java que ajuda a organizar consultas médicas.
 Ele tem três telas:
Uma para fazer login.


Uma para cadastrar consultas.


Uma para ver a lista de consultas.


É como se fosse um caderno digital, mas mais organizado e bonito.

👶 Como usar (bem fácil)
Quando você abre o programa, aparece a tela de login.
 Digite:


Usuário: admin


Senha: 123


Depois disso, você entra na tela de cadastro, onde escreve:


O nome do paciente,


A data da consulta,


E escolhe o médico numa lista.


Clique em "Cadastrar" para salvar.


A consulta aparece na tela de lista, onde você pode:


Editar alguma informação,


Ou Excluir a consulta.


Em cima tem um menu para voltar ao cadastro ou sair do programa.



📋 O que cada parte do programa faz
Main.java
É onde tudo começa. Quando você roda o programa, ele mostra a tela de login.

TelaLogin.java
Aqui você digita o nome de usuário e senha.
 Se estiver certo (admin e 123), ele te manda para a tela de cadastro.
 Se errar, mostra uma mensagem dizendo que está errado.

TelaCadastroConsulta.java
Essa tela serve para você criar novas consultas.
Ela tem:
Campos de texto para escrever o nome do paciente e a data.


Um ComboBox com uma lista de médicos.


Um botão de cadastrar para salvar.


Um JMenuBar com opções de navegação.


Quando você cadastra, a consulta vai para a lista.

TelaListaConsultas.java
Essa tela mostra uma lista de consultas usando o JList.
Você pode:
Ver todas as consultas cadastradas.


Selecionar uma e editar.


Excluir alguma se quiser.


Usar o menu para voltar ao cadastro.


Tem também um JScrollPane que permite rolar a lista se tiver muitas consultas.

📦 Componentes usados
JTextField: onde você digita o nome e a data.


JPasswordField: onde você digita a senha (e ela fica escondida).


JComboBox: uma caixinha com várias opções (os médicos).


JList: uma lista que mostra as consultas.


JMenuBar: um menu que fica em cima da janela.


JOptionPane: mensagens de aviso ou perguntas que aparecem na tela.



📚 O que é um CRUD?
O sistema é um CRUD, ou seja, ele faz:
C - Create (Criar): quando você cadastra uma nova consulta.


R - Read (Ler): quando vê as consultas na lista.


U - Update (Atualizar): quando edita alguma consulta.


D - Delete (Deletar): quando exclui uma consulta.



👨‍🏫 Explicando o código TelaListaConsultas.java
Esse código cria a tela da lista com as seguintes funções:
Mostra o título "Lista de Consultas".


Cria uma JList com todas as consultas.


Coloca a lista dentro de um JScrollPane para poder rolar.


Cria um menu (JMenuBar) com um botão para voltar à tela de cadastro.


Sempre que você abre essa tela, ela mostra o que foi cadastrado até agora.



✅ Pronto!
Agora você tem um sistema simples e funcional feito em Java com Swing.
 Ele ajuda a organizar consultas médicas de um jeito bem fácil de entender e usar.

