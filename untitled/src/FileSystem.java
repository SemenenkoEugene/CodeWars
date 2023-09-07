import java.io.File;
import java.io.FilenameFilter;

public class FileSystem {
    public static void main(String[] args) {
        File f = new File("out");
        String[] l = f.list(new FilenameFilter() {
            @Override
            public boolean accept(File dir, String name) {
                return name.startsWith("Simple");
            }
        });

        for (String g : l){
            System.out.println(g);
        }
    }
}
