package managers;


import pages.*;

public class PageObjectManager {
	private LoginPage loginPage;
	private LandingPage landingPage;
	private HomePage homepage;
	private PortfolioPage portfoliopage;
	private CreateNewListing createnewListing;
	private MarketPlacePage marketplace;
	private CixPages cixpages;
	private InvoicesPage invoicespage;

	private PlatformAdminPage platformadminpage;

	private OrdermanagementPage ordermanagementpage;

	private On_RampPage on_ramppage;

	private WebDriverManager app;


	public PageObjectManager() {
		this.app = new WebDriverManager();
	}

	public WebDriverManager getWebDriverManager() {
		return app;
	}

	public LoginPage getLoginPage() {
		if (loginPage == null)
			loginPage = new LoginPage(app);
		return loginPage;
	}

	public LandingPage getLandingPage() {
		if (landingPage == null)
			landingPage = new LandingPage(app);
		return landingPage;
	}

	public HomePage getHomePage() {
		if (homepage == null)
			homepage = new HomePage(app);
		return homepage;
	}

	public PortfolioPage getPortfolioPage() {
		if (portfoliopage == null)
			portfoliopage = new PortfolioPage(app);
		return portfoliopage;
	}

	public CreateNewListing getCreateNewListingPage() {
		if (createnewListing == null)
			createnewListing = new CreateNewListing(app);
		return createnewListing;
	}

	public MarketPlacePage getMarketPlacePage() {
		if (marketplace == null)
			marketplace = new MarketPlacePage(app);
		return marketplace;
	}

	public CixPages getCixPages() {
		if (cixpages == null)
			cixpages = new CixPages(app);
		return cixpages;
	}

	public InvoicesPage getInvoicesPage() {
		if (invoicespage == null)
			invoicespage = new InvoicesPage(app);
		return invoicespage;
	}


	public PlatformAdminPage getplatformadminpage() {
		if (platformadminpage == null)
			platformadminpage = new PlatformAdminPage(app);
		return platformadminpage;
	}


	public OrdermanagementPage getordermanagementpage() {
		if (ordermanagementpage==null)
			ordermanagementpage=new OrdermanagementPage(app);
		return ordermanagementpage;
	}

	public On_RampPage getOn_RampPage(){
		if (on_ramppage==null)
			on_ramppage=new On_RampPage(app);
		return on_ramppage;
	}


}



