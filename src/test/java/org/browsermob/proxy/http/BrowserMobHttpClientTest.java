package org.browsermob.proxy.http;

import org.eclipse.jetty.util.MultiMap;
import org.eclipse.jetty.util.UrlEncoded;
import org.junit.Assert;
import org.junit.Test;

import java.net.URI;
import java.net.URISyntaxException;

public class BrowserMobHttpClientTest
{

	@Test
	public void verifyURI()
	{

		BrowserMobHttpClient client = new BrowserMobHttpClient();
		try
		{
			String url = "http://example.com/cs/default.aspx?type=left&logo=0&bestdeal=1&pc=n&skin=001&pin=%3C%=pin%%3E&did=-1&txt=224273&target=_top";

			client.makeUri(url);

			client.makeUri("http://example.com/cs/default.aspx");
		} catch (URISyntaxException e)
		{
			Assert.fail("Exception was not supposed to happen here: " + e.getMessage());
		}
	}
}
