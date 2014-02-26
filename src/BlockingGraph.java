/*package visualization;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.axis.ValueAxis;
import org.jfree.chart.plot.XYPlot;
import org.jfree.data.time.Millisecond;
import org.jfree.data.time.TimeSeries;
import org.jfree.data.time.TimeSeriesCollection;
import org.jfree.data.xy.XYDataset;

public class BlockingGraph
{
	*//** The time series data. *//*
    private ChartPanel chartPanel;
    
    private TimeSeries series;
    
	*//**
     * Constructs a new demonstration application.
     *
     * @param title  the frame title.
     *//*
	@SuppressWarnings("deprecation")
	public BlockingGraph() 
    {
        this.series = new TimeSeries("Blocking", Millisecond.class);
        final TimeSeriesCollection dataset = new TimeSeriesCollection(this.series);
        final JFreeChart chart = createChart(dataset);

        chartPanel = new ChartPanel(chart);
    }
    
    public JFreeChart createChart(XYDataset dataset)
    {
    	final JFreeChart result = ChartFactory.createTimeSeriesChart(
                null, 
                null, 
                "Blocking",
                dataset, 
                true,
                true, 
                false
            );
            final XYPlot plot = result.getXYPlot();
            ValueAxis axis = plot.getDomainAxis();
            axis.setAutoRange(true);
            axis.setFixedAutoRange(30000.0);  // 60 seconds
            axis = plot.getRangeAxis();
            axis.setRange(0.0, 0.3); 
            return result;
    }
    
    public void addData(double network_blocking)
    {
    	this.series.addOrUpdate(new Millisecond(), network_blocking);
    }
    
    public ChartPanel getChartPanel()
    {
    	chartPanel.setPreferredSize(new java.awt.Dimension(200, 200));
    	return chartPanel;
    }
}
*/