import java.awt.Color;
import java.awt.image.BufferedImage;
import java.io.File;
import javax.imageio.ImageIO;
 
public class Encode {
    public static void main(String[] args) {
        if (args.length<2) {
            System.out.println("Formato: Encode imagen \"texto\"");
            System.exit(0);
        }
        String img_in=args[0];
        String message=args[1];
       
        message=message+"#";
        // cargar imagen
        BufferedImage img = null;
        try {
            img = ImageIO.read(new File(img_in));
        } catch (Exception e) {
            e.printStackTrace();
        }
       
        if (message.length()>((img.getWidth()*img.getHeight())/3)) {
            System.out.println("El mensaje es demasiado grande para la imagen.");
            System.exit(0);
        }
        // almacenar mensaje
        // cada tres pixels un caracter
        int pix_index=0;
        byte[] chars=null;
        try {
            chars=message.getBytes("ASCII");
        } catch (Exception e) {
            e.printStackTrace();
        }
        for (int i=0; i<chars.length; i++) {
            for (int j=0; j<3; j++) {
                int ycoord=(int)(pix_index/img.getWidth());
                int xcoord=pix_index-(ycoord*img.getWidth());
                int c = img.getRGB(xcoord,ycoord);
                int red = (int)((c & 0x00ff0000) >> 16);
                int green = (int)((c & 0x0000ff00) >> 8);
                int blue = (int)(c & 0x000000ff);
                if (isBitSet(chars[i], (j*3)+0)) {
                    red |= 1 << 0;
                } else {
                    red &= ~(1 << 0);
                }
                if (isBitSet(chars[i], (j*3)+1)) {
                    green |= 1 << 0;
                } else {
                    green &= ~(1 << 0);
                }
                if (j<2) {  // el ultimo byte no lo usamos
                    if (isBitSet(chars[i], (j*3)+2)) {
                        blue |= 1 << 0;
                    } else {
                        blue &= ~(1 << 0);
                    }          
                }
                Color color=new Color(red, green, blue);
                img.setRGB(xcoord, ycoord, color.getRGB());
                pix_index++;
            }
        }
        // guardar imagen
        try {
            File outputfile = new File("encodedimage.png");
            ImageIO.write(img, "png", outputfile);
        } catch(Exception e) {
            e.printStackTrace();
        }
    }
   
    private static Boolean isBitSet(byte b, int bit) {
        return (Boolean) ((b & (1 << bit)) != 0);
    }
}