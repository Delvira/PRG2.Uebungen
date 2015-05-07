package prg2.übungen07;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;
import java.util.Comparator;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

/**
 * SolidWorks GUI to read data from file and display them in different orders.
 */
public final class SolidWorks extends JFrame implements ActionListener {

    private static final String FILE_NAME = "C:\\Users\\Caro\\Documents\\HSLU\\PRG2\\NetBeans\\PRG2.Übungen\\build\\classes\\prg2\\übungen07\\soliddata_mixed.txt";

    private Shape[] solids;

    private final JButton bRead = new JButton("Read file '" + FILE_NAME + "'");
    private final JButton bSort1 = new JButton("Sort on 'volume'");
    private final JButton bSort2 = new JButton("Sort on 'surface'");
    private final JButton bSort3 = new JButton("Sort on 'dimension'");
    private final JTextArea outputArea = new JTextArea();

    /**
     * Konstruktor.
     */
    public SolidWorks() {
        super("SolidWorks");
        setSize(400, 400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        final JPanel topPanel = new JPanel();
        topPanel.add(bRead);
        add(topPanel, BorderLayout.NORTH);
        outputArea.setEditable(false);
        add(new JScrollPane(outputArea), BorderLayout.CENTER);

        final JPanel bottomPanel = new JPanel();
        bottomPanel.add(bSort1);
        bottomPanel.add(bSort2);
        bottomPanel.add(bSort3);
        add(bottomPanel, BorderLayout.SOUTH);

        // Listener registrieren
        bRead.addActionListener(this);
        bSort1.addActionListener(this);
        bSort2.addActionListener(this);
        bSort3.addActionListener(this);
    }

    /**
     * Gibt die Solids aus.
     */
    private void doOutput() {
        outputArea.setText("");
        for (final Shape solid : solids) {
            outputArea.append(solid.toString());
        }
    }

    /*
     * (non-Javadoc)
     * @see java.awt.event.ActionListener#actionPerformed(java.awt.event.ActionEvent)
     */
    @Override
    public void actionPerformed (final ActionEvent event) {
        if (event.getSource() == bRead) {
            try {
                solids = SolidFileIO.readSolids(FILE_NAME);
                doOutput();
            }
            catch (FileNotFoundException ex) {
                System.err.print(ex);
            }
            catch (IOException ex) {
                System.err.print(ex);
            }
        }
        if ((event.getSource() == bSort1) && (solids != null)) {
            Arrays.sort(solids);
            doOutput();
        }
        if ((event.getSource() == bSort2) && (solids != null)) {
            Arrays.sort(solids, new MyComparator(1));
            doOutput();
        }
        if ((event.getSource() == bSort3) && (solids != null)) {
            Arrays.sort(solids, new MyComparator(2));
            doOutput();
        }
    }

    /**
     * main-Methode für Start.
     * @param args nicht verwendet.
     */
    public static void main(final String[] args) {
        final SolidWorks frame = new SolidWorks();
        frame.setVisible(true);
    }
}
