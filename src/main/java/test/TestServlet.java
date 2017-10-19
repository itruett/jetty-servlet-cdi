package test;

import javax.servlet.http.*;
import javax.servlet.annotation.WebServlet;
import javax.inject.Inject;
import java.io.IOException;

@WebServlet(urlPatterns= {"/test"})
public class TestServlet extends HttpServlet {
	@Inject private Foo foo;

	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {
		res.getWriter().write(foo.toString());
	}
}

