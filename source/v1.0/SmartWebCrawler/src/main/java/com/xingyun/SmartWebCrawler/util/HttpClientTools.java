package com.xingyun.SmartWebCrawler.util;

import org.apache.http.HttpEntity;
import org.apache.http.NameValuePair;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;

import java.io.IOException;
import java.net.SocketTimeoutException;
import java.util.List;

/**
 * HttpClient 请求工具类
 * 若使用必须将此依赖项添加到POM.xml中
 * 		<!-- HttpClient http://hc.apache.org/ -->
		<dependency>
			<groupId>org.apache.httpcomponents</groupId>
			<artifactId>httpclient</artifactId>
			<version>4.5.5</version>
		</dependency>
 * */
public class HttpClientTools {

	/**
	 * @params String requestURL 请求的URL
	 * @params String charSet 字符集
	 * @Reurn String Get请求响应的内容 String doGet(String requestURL,String charSet);
	 */
	public static String doGet(String requestURL, String charSet) {

		String responsePageContent = null;

		CloseableHttpClient httpclient = HttpClients.createDefault();

		HttpGet httpGet = new HttpGet(requestURL);

		CloseableHttpResponse response = null;
		try {
			response = httpclient.execute(httpGet);
			HttpEntity entity = response.getEntity();
			switch (response.getStatusLine().getStatusCode()) {
			case 200:
				if (entity != null) {
					responsePageContent = EntityUtils.toString(response.getEntity(), charSet);
				} else {
					System.out.println("count't catch the error");
				}
				break;
			case 400:
				responsePageContent = "400（错误请求）服务器不理解请求的语法。";
				break;
			case 401:
				responsePageContent = "401 未授权）请求要求身份验证。对于需要token的接口，服务器可能返回此响应。";
				break;
			case 403:
				responsePageContent = "403（禁止）服务器拒绝请求。对于群组/聊天室服务，表示本次调用不符合群组/聊天室操作的正确逻辑，例如调用添加成员接口，添加已经在群组里的用户，或者移除聊天室中不存在的成员等操作。";
				break;
			case 404:
				responsePageContent = "404（未找到）服务器找不到请求的接口";
				break;
			case 405:
				responsePageContent = "405 该请求使用的方法被服务器端禁止使用,RFC2616中规定, GET 和 HEAD 方法不能被禁止.";
				break;
			case 408:
				responsePageContent = "408（请求超时）服务器等候请求时发生超时。";
				break;
			case 413:
				responsePageContent = "413（请求体过大）请求体超过了5kb，拆成更小的请求体重试即可。";
				break;
			case 429:
				responsePageContent = "429（服务不可用）请求接口超过调用频率限制，即接口被限流。";
				break;
			case 500:
				responsePageContent = "500（服务器内部错误）服务器遇到错误，无法完成请求。";
				break;
			case 501:
				responsePageContent = "501（尚未实施）服务器不具备完成请求的功能。例如，服务器无法识别请求方法时可能会返回此代码。";
				break;
			case 502:
				responsePageContent = "502（错误网关）服务器作为网关或代理，从上游服务器收到无效响应。";
				break;
			case 503:
				responsePageContent = "503（服务不可用）请求接口超过调用频率限制，即接口被限流。";
				break;
			case 504:
				responsePageContent = "504（网关超时）服务器作为网关或代理，但是没有及时从上游服务器收到请求。";
				break;
			default:
				responsePageContent = "不可预知的错误";
				break;
			}
			EntityUtils.consume(entity);//关闭流在这个方法里面
		} catch (SocketTimeoutException e) {
			responsePageContent = e.toString();
		} catch (IOException e) {
			responsePageContent = e.toString();
		} 
		return responsePageContent;
	}
	
	public static String doPost(String requestURL,String charSet,List<NameValuePair> nvps) {
		String responsePageContent = null;
		
		CloseableHttpClient httpclient = HttpClients.createDefault();
		HttpPost httpPost = new HttpPost(requestURL);	
		
		CloseableHttpResponse response =null;
		try {
			httpPost.setEntity(new UrlEncodedFormEntity(nvps));
			response = httpclient.execute(httpPost);
			
			HttpEntity entity = response.getEntity();
			switch (response.getStatusLine().getStatusCode()) {
			case 200:
				if (entity != null) {
					responsePageContent = EntityUtils.toString(response.getEntity(), charSet);
				} else {
					responsePageContent="Couldn't catch the error";
				}
				break;
			case 400:
				responsePageContent = "400（错误请求）服务器不理解请求的语法。";
				break;
			case 401:
				responsePageContent = "401 未授权）请求要求身份验证。对于需要token的接口，服务器可能返回此响应。";
				break;
			case 403:
				responsePageContent = "403（禁止）服务器拒绝请求。对于群组/聊天室服务，表示本次调用不符合群组/聊天室操作的正确逻辑，例如调用添加成员接口，添加已经在群组里的用户，或者移除聊天室中不存在的成员等操作。";
				break;
			case 404:
				responsePageContent = "404（未找到）服务器找不到请求的接口";
				break;
			case 405:
				responsePageContent = "405 该请求使用的方法被服务器端禁止使用,RFC2616中规定, GET 和 HEAD 方法不能被禁止.";
				break;
			case 408:
				responsePageContent = "408（请求超时）服务器等候请求时发生超时。";
				break;
			case 413:
				responsePageContent = "413（请求体过大）请求体超过了5kb，拆成更小的请求体重试即可。";
				break;
			case 429:
				responsePageContent = "429（服务不可用）请求接口超过调用频率限制，即接口被限流。";
				break;
			case 500:
				responsePageContent = "500（服务器内部错误）服务器遇到错误，无法完成请求。";
				break;
			case 501:
				responsePageContent = "501（尚未实施）服务器不具备完成请求的功能。例如，服务器无法识别请求方法时可能会返回此代码。";
				break;
			case 502:
				responsePageContent = "502（错误网关）服务器作为网关或代理，从上游服务器收到无效响应。";
				break;
			case 503:
				responsePageContent = "503（服务不可用）请求接口超过调用频率限制，即接口被限流。";
				break;
			case 504:
				responsePageContent = "504（网关超时）服务器作为网关或代理，但是没有及时从上游服务器收到请求。";
				break;
			default:
				responsePageContent = "不可预知的错误";
				break;
			}
			EntityUtils.consume(entity);//关闭流在这个方法里面
		} catch (SocketTimeoutException e) {
			responsePageContent = e.toString();
		} catch (IOException e) {
			responsePageContent = e.toString();
		}
		return responsePageContent;
	}
	
	

}
