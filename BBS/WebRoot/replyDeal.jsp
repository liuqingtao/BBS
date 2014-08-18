<%@ page language="java" import="java.util.*,java.sql.*,com.lqt.test.*" contentType="text/html; charset=GB18030"
    pageEncoding="GB18030"%>
    <%
    String title=request.getParameter("title");
    int pid=Integer.parseInt(request.getParameter("pid"));
    int rootId=Integer.parseInt(request.getParameter("rootId"));
    System.out.println(title);
    String cont = request.getParameter("cont");
    System.out.println(cont);
    Connection conn=DB.getConn();
    String sql="insert into article values(null,?,?,?,?,now(),?)";
    PreparedStatement pstmt=DB.prepareStmt(conn, sql);
    pstmt.setInt(1,pid);
    pstmt.setInt(2,rootId);
    pstmt.setString(3, title);
    pstmt.setString(4,cont);
    pstmt.setInt(5,0);
    pstmt.executeUpdate();
    DB.close(pstmt);
    DB.close(conn);
   %>
<script language="JavaScript1.2" type="text/javascript">
<!--
//  Place this in the 'head' section of your page.  

function delayURL(url, time) {
    setTimeout("top.location.href='" + url + "'", time);
}

//-->

</script>

<!-- Place this in the 'body' section -->
3秒后自动跳转，如果不跳转，请点击下面链接
<a href="article.jsp">回到主题列表</a>
<script type="text/javascript">
	delayURL("article.jsp",3000);
</script>
