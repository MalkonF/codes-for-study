package mouseevents2;

import java.awt.BorderLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class MouseDetailsFrame extends JFrame {

    private String details;
    private final JLabel statusBar;

    public MouseDetailsFrame() {
        super("Mouse Clicks and Buttons");

        statusBar = new JLabel("Click the mouse");
        add(statusBar, BorderLayout.SOUTH);
        addMouseListener(new MouseClickHandler());
    }

    private class MouseClickHandler extends MouseAdapter {

        @Override
        public void mouseClicked(MouseEvent event) {
            int xPos = event.getX();
            int yPos = event.getY();

            details = String.format("Clicked %d time(s)",
                    event.getClickCount());

            if (event.isMetaDown()) // botão direito  
            {
                details += " with right mouse button";
            } else if (event.isAltDown()) // botão meio
            {
                details += " with center mouse button";
            } else // botão esquerdo                    
            {
                details += " with left mouse button";
            }

            statusBar.setText(details);
        }
    }
}
