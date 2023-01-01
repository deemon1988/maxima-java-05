package org.example;

public class App 
{
    public static void main( String[] args ) throws Exception {

        //StringBuilder собрать строку в цикле
          //  склеить много строк - Stringformat
      /*  FileWriter writer = new FileWriter("result.html", false);

        String resourcesPath = App.class.getClassLoader().getResources("templates").nextElement().getPath();

        Configuration config = new Configuration(Configuration.VERSION_2_3_31);
        config.setDirectoryForTemplateLoading(new File(resourcesPath));
        config.setDefaultEncoding("UTF-8");
        Map root = new HashMap<>();
        root.put("title", "Данные кота");

        Cat cat = new Cat("Мурзик",5,true);
        root.put("cat", cat);

        Template template = config.getTemplate("index.html");
        template.process(root, writer);

        writer.flush();
        writer.close();
*/
       DynamicPage.createPage("catResult.html");
        //System.out.println(System.getProperty("os.name"));
        CatServlet catServlet = new CatServlet();
    }
}
