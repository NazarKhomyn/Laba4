import net.sf.saxon.xqj.SaxonXQDataSource;

import javax.xml.xquery.*;
import java.util.ArrayList;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public XQDataSource ds;
    public XQConnection conn;
    public static Map<String,String> commands = new HashMap<String, String>();

    public  Main() throws XQException {
        ds = new SaxonXQDataSource();
        conn = ds.getConnection();
        commands.put("3a", "let $x := doc(\"Data_Base/books.xml\")/all_books/book return $x/data(title)");
        commands.put("3b", "for $x in distinct-values(doc(\"Data_Base/books.xml\")/all_books/book/author) order by $x return $x");
        commands.put("3c", "for $x in distinct-values(doc(\"Data_Base/books.xml\")/all_books/book/genre) order by $x return $x");
        commands.put("3d1", "for $x in distinct-values(doc(\"Data_Base/books.xml\")/all_books/book/city) order by $x return $x");
        commands.put("3d2", "for $x in distinct-values(doc(\"Data_Base/books.xml\")/all_books/book/publisher) order by $x return $x");
        commands.put("3e", "for $x in doc(\"Data_Base/books.xml\")/all_books/book where $x/author = \"Erin A. Cole\" return $x/data(title)");
        commands.put("3f", "for $x in doc(\"Data_Base/books.xml\")/all_books/book where $x/publisher = \"Vivamus Ltd\" return $x/data(title)");
        commands.put("3g", "for $x in doc(\"Data_Base/books.xml\")/all_books/book where $x/genre = \"drama\" return $x/data(title)");
        commands.put("3h", "for $x in doc(\"Data_Base/books.xml\")/all_books/book where $x/year > 1900 and $x/year < 1970 order by $x/year return $x/data(title)");
        commands.put("3i", "for $x in doc(\"Data_Base/books.xml\")/all_books/book where $x/price > 30 and $x/price < 50 order by $x/price return $x/data(title)");
        commands.put("3j1", "let $c := 0 return count(for $x in doc(\"Data_Base/books.xml\")/all_books/book where $x/author=\"Erin A. Cole\" return $x/data(author))");
        commands.put("3j2", "let $c := 0 return sum(for $x in doc(\"Data_Base/books.xml\")/all_books/book where $x/author=\"Erin A. Cole\" return $x/data(price))");
        commands.put("3k1", "let $c := 0 return count(for $x in doc(\"Data_Base/books.xml\")/all_books/book where $x/cover=\"solid\" return $x/cover)");
        commands.put("3k2", "let $c := 0 return count(for $x in doc(\"Data_Base/books.xml\")/all_books/book where $x/cover=\"soft\" return $x/cover)");
    }

    public static void main(String[] args) throws XQException, FileNotFoundException {
        Main request = new Main();
        System.out.println(request.execute(commands.get("3d1")));
    }

    public String execute(String query) throws FileNotFoundException, XQException{
        List<String> res = new ArrayList<>();
        XQPreparedExpression exp = conn.prepareExpression(query);
        XQResultSequence result = exp.executeQuery();
        while (result.next()) {
            res.add(result.getItemAsString(null));
        }
        return  res.toString();
    }
}
