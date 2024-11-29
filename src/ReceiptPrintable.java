import java.awt.*;
import java.awt.print.*;
import java.awt.image.BufferedImage;
import java.io.File;
import javax.imageio.ImageIO;

public class ReceiptPrintable implements Printable {

    private String receiptContent;
    private BufferedImage logoImage;
    private String companyName;

    public ReceiptPrintable(String content, String companyName, String logoPath) {
        this.receiptContent = content;
        this.companyName = companyName;

        // Load the logo image
        try {
            logoImage = ImageIO.read(new File(logoPath));
        } catch (Exception e) {
            logoImage = null;
            e.printStackTrace();
        }
    }

    @Override
    public int print(Graphics g, PageFormat pf, int pageIndex) throws PrinterException {
        if (pageIndex > 0) {
            return NO_SUCH_PAGE;
        }

        Graphics2D g2d = (Graphics2D) g;
        g2d.translate(pf.getImageableX(), pf.getImageableY());

        // Print the logo
        if (logoImage != null) {
            int logoWidth = 60;  // Adjust to desired width
            int logoHeight = 60; // Adjust to desired height
            g2d.drawImage(logoImage, 10, 10, logoWidth, logoHeight, null);
        }

        // Print the company name
        g2d.setFont(new Font("Monospaced", Font.BOLD, 14));
        g2d.drawString(companyName, 80, 40); // Adjust position based on logo size

        // Draw a line under the header
        g2d.drawLine(10, 80, (int) pf.getImageableWidth() - 10, 80);

        // Print the receipt content from JTextArea
        g2d.setFont(new Font("Monospaced", Font.PLAIN, 12));
        int y = 100; // Start position for content, adjust if necessary
        for (String line : receiptContent.split("\n")) {
            if (line.contains("=========================")) {
                // Draw a graphic line instead of the text-based separator
                g2d.drawLine(10, y, (int) pf.getImageableWidth() - 10, y);
                y += 10; // Adjust spacing after the line
            } else {
                g2d.drawString(line, 10, y);
                y += 15; // Adjust line spacing
            }
        }

        return PAGE_EXISTS;
    }
}
