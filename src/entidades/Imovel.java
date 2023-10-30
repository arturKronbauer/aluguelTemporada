package entidades;

public class Imovel {
	private Integer codigo;
	private String descricao;
	
	public Imovel() {
	}
	
	public Imovel(Integer codigo, String descricao) {
		this.codigo = codigo;
		this.descricao = descricao;
	}

	public Integer getCodigo() {
		return codigo;
	}

	public void setId(Integer codigo) {
		this.codigo = codigo;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	@Override
	public String toString() {
		return "Imovel [Código=" + codigo + ", Descrição=" + descricao + "]";
	}
}
