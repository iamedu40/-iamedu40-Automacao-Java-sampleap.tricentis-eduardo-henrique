package steps;

import java.util.List;

import org.junit.Assert;

import com.edsoft.framework.base.web.BaseFuncionalidadeWeb;
import com.edsoft.framework.configs.Settings;

import cucumber.api.DataTable;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.E;
import cucumber.api.java.pt.Entao;
import pagina.web.home.HomePage;

public class CriandoContaStep extends BaseFuncionalidadeWeb {

	@Dado("^que estou com a aplicacao aberta$")
	public void queEstouComAAplicacao() throws Throwable {
		CurrentPage = GetInstance(HomePage.class);
	}

	@Dado("^informo os dados enter vehicle data$")
	public void informo_os_dados_enter_vehicle_data(DataTable table) throws Throwable {
		List<List<String>> data = table.raw();
		CurrentPage.As(HomePage.class).preencherVehicel(data.get(0).get(0),
				data.get(1).get(0),
				data.get(2).get(0),
				data.get(3).get(0),
				data.get(4).get(0),
				data.get(5).get(0),
				data.get(6).get(0),
				data.get(7).get(0),
				data.get(8).get(0),
				data.get(9).get(0),
				data.get(10).get(0),
				data.get(11).get(0));
		Settings.Logs.GravaLogReport("^vehicle data$");

	}
	
	@E("^informo os dados enter insurant data$")
	public void informo_os_dados_enter_insurant_data(DataTable table) throws Throwable {
		List<List<String>> data = table.raw();
		CurrentPage.As(HomePage.class).preencherInsurant(
				data.get(0).get(0),
				data.get(1).get(0),
				data.get(2).get(0),
				data.get(3).get(0),
				data.get(4).get(0),
				data.get(5).get(0),
				data.get(6).get(0),
				data.get(7).get(0));
		Settings.Logs.GravaLogReport("^insurant data$");
	}
	
	
	@Dado("^informo os dados enter Product Data$")
	public void informo_os_dados_enter_Product_Data(DataTable table) throws Throwable {
		List<List<String>> data = table.raw();
		CurrentPage.As(HomePage.class).preencherProductData(
				data.get(0).get(0),
				data.get(1).get(0),
				data.get(2).get(0),
				data.get(3).get(0),
				data.get(4).get(0));
	}
	
	@E("^seleciono Price optionProduct$")
	public void seleciono_Price_optionProduct(DataTable table) throws Throwable {
		List<List<String>> data = table.raw();
		CurrentPage.As(HomePage.class).selecionarPriceOption(data.get(0).get(0));
	}


	@Dado("^preencho o formulador de login send quote$")
	public void preencho_o_formulador_de_login_send_quote(DataTable table) throws Throwable {
		List<List<String>> data = table.raw();
		CurrentPage.As(HomePage.class).preemcherFormularioLogin(data.get(0).get(0),
				data.get(1).get(0),
				data.get(2).get(0),
				data.get(3).get(0),
				data.get(4).get(0),
				data.get(5).get(0));
	}
	
	
	@Entao("^valido a mensagem email enviado com sucesso$")
	public void valido_a_mensagem_email_enviado_com_sucesso() throws Throwable {
		Assert.assertEquals("Sending e-mail success!", CurrentPage.As(HomePage.class).validaEmailComSucesso());
	}
}
