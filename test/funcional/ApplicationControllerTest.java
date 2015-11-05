package funcional;

import static org.fest.assertions.Assertions.assertThat;
import static play.test.Helpers.callAction;
import static play.test.Helpers.charset;
import static play.test.Helpers.contentAsString;
import static play.test.Helpers.fakeRequest;
import static play.test.Helpers.redirectLocation;
import static play.test.Helpers.status;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.persistence.EntityManager;

import models.Anuncio;
import models.dao.GenericDAO;

import org.junit.Test;

import play.mvc.Http;
import play.mvc.Result;
import base.AbstractTest;

public class ApplicationControllerTest extends AbstractTest {

	Result result;
	EntityManager em;
	
	@Test
	public void callIndex() {
		// realiza a chamada ao método index() do Application
		result = callAction(controllers.routes.ref.Application.index(),
				fakeRequest());

		assertThat(status(result)).isEqualTo(Http.Status.OK);
	}
	
	@Test
	public void callAnuncios() {
		// realiza a chamada ao método anuncios() do Application
		result = callAction(controllers.routes.ref.Application.anuncios(),
				fakeRequest());
		// ao chamar o método anuncios do Application, ele retora o html
		// correspondente.
		assertThat(status(result)).isEqualTo(Http.Status.OK);
		assertThat(charset(result)).isEqualTo("utf-8");
		assertThat(contentAsString(result)).contains("Cria um novo Anúncio");
	}
	
	@Test
	public void callNewAnuncio() {
		// Mapa com os dados do formulario para criação do anuncio
		Map<String, String> formData = new HashMap<String, String>();
		formData.put("Anuncio", "Banda");
		
		// realiza a chamada ao método novoAnuncio() do Application com o formulário.
		result = callAction(
				controllers.routes.ref.Application.novoAnuncio(), fakeRequest()
						.withFormUrlEncodedBody(formData));
		
		assertThat(status(result)).isEqualTo(Http.Status.SEE_OTHER);
		
		}
	
	@Test
	public void callRemoveAnuncio() {
		
		result = callAction(controllers.routes.ref.Application.redirecionaRemoveAnuncio(),
						fakeRequest());
		assertThat(status(result)).isEqualTo(Http.Status.OK);
		assertThat(contentAsString(result)).contains("Remover Anúncio");
			
	}
	
	@Test
	public void callRedirecionaComentarios() {
		
		result = callAction(controllers.routes.ref.Application.redirecionaComentarios(),
						fakeRequest());
		assertThat(status(result)).isEqualTo(Http.Status.OK);
		assertThat(contentAsString(result)).contains("Seção de perguntas e respostas");
	}
}