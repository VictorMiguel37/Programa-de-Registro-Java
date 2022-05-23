/*
Um simples programa de registro feito em Java.

Data: 23-5-2022
Feito por Victor Miguel
*/

import javax.swing.JOptionPane;

public class App {
    public static void main(String[] arguments) {
        String name = "";
        String password = "";
        String vPassword;
        String where;
        Integer certain;

        name = JOptionPane.showInputDialog("Digite seu nome.");

        if (name == null) {
            System.exit(0);
        }

        while (true) {
            password = JOptionPane.showInputDialog("Digite sua senha.");

            if (password == null) {
                System.exit(0);
            }

            if (password.length() < 8) {
                JOptionPane.showMessageDialog(null, "Erro: senha abaixo de 8 digitos.",
                "Programa de registro", JOptionPane.ERROR_MESSAGE);
            
                continue;
            } else {
                break;
            }
        }

        while (true) {
            vPassword = JOptionPane.showInputDialog("Digite sua senha novamente.");

            if (vPassword == null) {
                System.exit(0);
            }

            if (password.equals(vPassword)) {
                break;
            } else {
                JOptionPane.showMessageDialog(null, "Erro: As senhas nao sao iguais.",
                "Programa de registro", JOptionPane.ERROR_MESSAGE);

                continue;
            }
        }

        certain = JOptionPane.showConfirmDialog(null, "Tem certeza?\nNome: " + name + "\nSenha: " + password);

        if (certain == 1) {
            while (true) {
                where = JOptionPane.showInputDialog("Onde quer modificar?\n[1] Nome\n[2] Senha\n[3] Sair");

                if (where == null) {
                    System.exit(0);
                }

                if (Integer.parseInt(where) == 1) {
                    name = JOptionPane.showInputDialog("Digite seu novo nome.");
                
                    if (name == null) {
                        System.exit(0);
                    }
                } else if (Integer.parseInt(where) == 2) {
                    while (true) {
                        password = JOptionPane.showInputDialog("Digite sua nova senha.");

                        if (password == null) {
                            System.exit(0);
                        }

                        if (password.length() < 8) {
                            JOptionPane.showMessageDialog(null, "Erro: senha abaixo de 8 digitos.",
                            "Programa de registro", JOptionPane.ERROR_MESSAGE);
                        
                            continue;
                        } else {
                            break;
                        }
                    }
                } else if (Integer.parseInt(where) == 3) {
                    break; 
                } else {
                    JOptionPane.showMessageDialog(null, "Erro: digite um numero compativel.",
                    "Programa de registro", JOptionPane.ERROR_MESSAGE);
                }
            }
        } else if (certain == 2) {
            System.exit(0);
        }

        JOptionPane.showMessageDialog(null, "Sua conta foi criada!\nNome: " + name + "\nSenha: " + password);
    }
}
