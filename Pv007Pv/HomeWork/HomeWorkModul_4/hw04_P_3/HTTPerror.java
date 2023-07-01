package hw04_P_3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/** Input three integer numbers and and output the maximum and minimum values of them to
 the console.*/
public class HTTPerror {
    public static void main(String[] args) throws IOException {
        // A BufferedReader object is created to read the input value from the console.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the HTTP error code");
        String error = br.readLine();  // Reading the entered string from the console.

          // Сhecking the HTTP error number
        error = switch (error) {
            case "400" -> "Bad Request";
            case "401" -> "Unauthorized";
            case "402" -> "Payment Required";
            case "403" -> "Forbidden";
            case "404" -> "Not Found";
            case "405" -> "Method Not Allowed";
            case "406" -> "Not Acceptable";
            case "407" -> "Proxy Authentication Required";
            case "408" -> "Request Timeout";
            case "409" -> "Conflict";
            case "410" -> "Gone";
            case "411" -> "Length Required";
            case "412" -> "Precondition Failed";
            case "413" -> "Request Entity Too Large";
            case "414" -> "Request-URI Too Long";
            case "415" -> "Unsupported Media Type";
            case "416" -> "Requested Range Not Satisfiable";
            case "417" -> "Expectation Failed";
            case "418" -> "I'm a teapot";
            case "419" -> "Authentication Timeout";
            case "420" -> "Method Failure";
            case "422" -> "Unprocessable Entity";
            case "423" -> "Locked";
            case "424" -> "Failed Dependency";
            case "426" -> "Upgrade Required";
            case "428" -> "Precondition Required";
            case "429" -> "Too Many Requests";
            case "431" -> "Request Header Fields Too Large — RFC 6585";
            case "440" -> "Login Timeout (Microsoft)";
            case "444" -> "No Response (Nginx)";
            case "449" -> "Retry With (Microsoft)";
            case "450" -> "Locked";
            case "451" -> "Unavailable For Legal Reasons (Internet draft)";
            case "494" -> "Request Header Too Large (Nginx)";
            case "495" -> "Cert Error (Nginx)";
            case "496" -> "No Cert (Nginx)";
            case "497" -> "HTTP to HTTPS (Nginx)";
            case "498" -> "Token expired/invalid (Esri)";
            case "499" -> "Client Closed Request (Nginx)";
            case "500" -> "Internal Server Error";
            case "501" -> "Not Implemented";
            case "502" -> "Bad Gateway";
            case "503" -> "Service Unavailable";
            case "504" -> "Gateway Timeout";
            case "505" -> "HTTP Version Not Supported";
            case "507" -> "Insufficient Storage (WebDAV; RFC 4918)";
            case "509" -> "Bandwidth Limit Exceeded (Apache)[3]";
            case "510" -> "Not Extended (RFC 2774)";
            case "511" -> "Network Authentication Required (RFC 6585)";
            case "520" -> "Origin Error (Cloudflare)";
            case "521" -> "Web server is down (Cloudflare)";
            case "522" -> "Connection timed out (Cloudflare)";
            case "523" -> "Proxy Declined Request (Cloudflare)";
            case "524" -> "A timeout occurred (Cloudflare)";
            case "598" -> "Network read timeout error (Unknown)";
            case "599" -> "Network connect timeout error (Unknown)";
            default -> "Unknown error";
        };
        System.out.println("HTTPError: " + error);
    }
}
