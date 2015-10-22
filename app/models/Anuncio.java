package models;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

import org.joda.time.LocalDate;

import com.google.common.base.Objects;

@Entity(name = "Anuncio")
public class Anuncio {
	
		@Id
		@GeneratedValue
		private Long id;
		
		@ManyToMany(cascade = CascadeType.ALL)
		private List<Instrumento> instrumentos;
	    
	    @ManyToMany(cascade  = CascadeType.ALL)
	    private List<Estilo> estilosGosta;
	    
	    @ManyToMany(cascade  = CascadeType.ALL)
	    private List<EstiloNO> estilosNaoGosta;

		@Column
		private String titulo;
		
		private String descricao;
		
		private String cidade;
		
		private String bairro;
		
		private String email;
		
		private String facebook;
		
		private String formarBanda;
		
		private String tocarCasual;
		
		private String codigo;
		
		private LocalDate data;

		// Construtor vazio para o Hibernate criar os objetos
		public Anuncio() {
			this.instrumentos = new ArrayList<Instrumento>();
			this.estilosGosta = new ArrayList<Estilo>();
			this.estilosNaoGosta = new ArrayList<EstiloNO>();
			this.data = LocalDate.now();
		}

	    public Anuncio(String titulo, String descricao, String cidade, String bairro, String email, 
	    		String facebook, String formarBanda, String tocarCasual,
	    		String codigo, Instrumento... instrumentos) {
	        this();
	        this.titulo = titulo;
	        this.descricao = descricao;
	        this.cidade = cidade;
	        this.bairro = bairro;
	        this.email = email;
	        this.facebook = facebook;
	        this.formarBanda = formarBanda;
	        this.tocarCasual = tocarCasual;
	        this.codigo = codigo;
	        this.data = LocalDate.now();
	        this.instrumentos = Arrays.asList(instrumentos);
	    }

	    public Anuncio(String titulo, Instrumento... instrumentos) {
	        this.instrumentos = Arrays.asList(instrumentos);
	        this.titulo = titulo;
	    }

	    public String getTitulo() {
			return titulo;
		}

	    public void setTitulo(String titulo) {
	        this.titulo = titulo;
	    }
	    
	    public String getDescricao() {
			return descricao;
		}
	    
	    public String getCidade() {
			return cidade;
		}

	   public void setCidade(String cidade) {
	        this.cidade = cidade;
	    }
	    
	    public String getBairro() {
			return bairro;
		}

	    public void setBairro(String bairro) {
	        this.bairro = bairro;
	    }

	    public void setDescricao(String descricao) {
	        this.descricao = descricao;
	    }
	    
	    public String getEmail() {
	       return email;
	    }

	    public void setEmail(String email) {
	        this.email = email;
	    }
	    
	    public String getFacebook() {
		       return facebook;
		    }

		public void setFacebook(String facebook) {
		        this.facebook = facebook;
		}
		
		public String getBanda() {
			return formarBanda;
		}

	    public void setBanda(String banda) {
	        this.formarBanda = banda;
	    }
	    
	    public String getTocar() {
			return tocarCasual;
		}

	    public void setTocar(String tocar) {
	        this.tocarCasual = tocar;
	    }
	    
	    public String getCodigo() {
			return codigo;
		}

	    public void setCodigo(String codigo) {
	        this.codigo = codigo;
	    }

	    public Long getId() {
			return id;
		}
	    
	    public String getDataFormatada(){
	    	String aux = data.dayOfMonth().get() + "/" + data.monthOfYear().get()
	    			+ "/" + data.year().get();
	    	return aux;
	    }
	    
	    public LocalDate getData() {
			return data;
		}

	    public void setData(LocalDate data) {
	        this.data = data;
	    }

		@Override
		public boolean equals(Object obj) {
			if (obj == null || !(obj instanceof Anuncio)) {
				return false;
			}
			Anuncio outroLivro = (Anuncio) obj;
			return Objects.equal(outroLivro.getTitulo(), this.getTitulo());
		}

		@Override
		public int hashCode() {
			return Objects.hashCode(this.getTitulo());
		}

	    public List<Instrumento> getInstrumentos() {
	        return Collections.unmodifiableList(instrumentos);
	    }
	    
	    public List<Estilo> getEstilosGosta() {
	        return Collections.unmodifiableList(estilosGosta);
	    }

	    public void addEstiloGosta(Estilo... estilo) {
	    	this.estilosGosta = Arrays.asList(estilo);
	    }
	    
	    public void addListEstiloGosta(List<Estilo> estilo) {
	    	this.estilosGosta = estilo;
	    }
	    
	    public List<EstiloNO> getEstilosNaoGosta() {
	        return Collections.unmodifiableList(estilosNaoGosta);
	    }

	    public void addEstiloNaoGosta(EstiloNO... estiloNG) {
	    	this.estilosNaoGosta = Arrays.asList(estiloNG);
	    }
	    
	    public void addListEstiloNaoGosta(List<EstiloNO> estiloNG) {
	    	this.estilosNaoGosta = estiloNG;
	    }
	    
	    public void addInstrumento(List<Instrumento> instrumento) {
	        instrumentos = instrumento;
	    }
	    
	    public void setId(long id) {
	        this.id = id;
	    }
}
