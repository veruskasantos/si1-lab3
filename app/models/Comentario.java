package models;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.ManyToOne;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;

//Entidade que representa uma Tabela no Banco de Dados
@Entity(name = "Comentario")
public class Comentario {

	// Gerador de Sequencia para o Id
	@Id
	@GeneratedValue
	private Long id;

	private String descricao;
	
	private String resposta;

	// Relação Muitos para Um
	
	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable
	private List<Anuncio> anuncio;

	// Construtor Vazio para o Hibernate criar os objetos
	public Comentario(){
		this.resposta = "-Sem Resposta-";
		anuncio = new ArrayList<Anuncio>();
	}
	
	public Comentario(String descricao) {
        this();
        this.descricao = descricao;
    }

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getResposta() {
		return resposta;
	}

	public void addResposta(String resposta, String codigo) {
		if(codigo.equalsIgnoreCase(anuncio.get(0).getCodigo())){
			this.resposta = resposta;
		}
	}
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public List<Anuncio> getAnuncio() {
		return anuncio;
	}
	
	public void addAnuncio(Anuncio anuncio) {
		if(!this.anuncio.contains(anuncio)){
			if(this.anuncio.size() != 0){
				this.anuncio = new ArrayList<Anuncio>();
			}
			this.anuncio.add(anuncio);
		}  
    }
}
