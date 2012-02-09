package org.browsermob.proxy.http;

import org.browsermob.proxy.http.BrowserMobHttpClient;
import sun.jvm.hotspot.utilities.Assert;

import java.net.MalformedURLException;
import java.net.URISyntaxException;

public class BrowserMobHttpClientTest
{

	@org.junit.Test
	public void verifyURI()
	{

		BrowserMobHttpClient client = new BrowserMobHttpClient();
		try
		{
			String url = "http://cs.cruise.com/cs/default.aspx?type=left&logo=0&bestdeal=1&pc=n&skin=001&pin=%3C%=pin%%3E&did=-1&txt=224273&target=_top";

			client.makeUri(url);
		} catch (URISyntaxException e)
		{
			org.junit.Assert.fail("Exception was not supposed to happen here: " + e.getMessage());
		}
	}

}
