package br.edu.ifpb;
import javax.enterprise.context.RequestScoped;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;
import java.io.Serializable;
import java.util.ArrayList;

@Named
//@RequestScoped
@SessionScoped
public class Controlador implements Serializable {

    private Pessoa pessoa = new Pessoa("");
    private ArrayList<String> pessoas = new ArrayList<String>();

    public String redirecionar(){
        //pessoa.alterarNome();
        return "home.xhtml?faces-redirect=true";
    }

    public String adicionarNaLista(){
        pessoas.add(this.pessoa.getNome());
        return null;
    }

    public Pessoa getPessoa() {
        return pessoa;
    }

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }

    public ArrayList<String> getPessoas() {
        return pessoas;
    }

    public void setPessoas(ArrayList<String> pessoas) {
        this.pessoas = pessoas;
    }
}
