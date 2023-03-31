package br.edu.ifnmg;

/**
 * @author Bruno Vinícius
 */
public class PessoaJuridica extends Entidade{
    private Long cnpj;

    public Long getCnpj() {
        return cnpj;
    }

    public void setCnpj(Long cnpj) {
        this.cnpj = cnpj;
    }
}
