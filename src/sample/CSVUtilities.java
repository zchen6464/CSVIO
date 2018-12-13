package sample;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CSVUtilities {
    ArrayList<String> CSVData;
    int numColumns;

    public CSVUtilities(File csv)throws IOException
    {
        Scanner reader = new Scanner(csv);
        CSVData.add(reader.nextLine());
        numColumns = CSVData.get(0).split(",").length;
    }

    public List<String> getColumnHeaders()
    {
        ArrayList<String> header = new ArrayList<>();
        for(int i = 0; i < numColumns; i++)
        {
            header.add(CSVData.get(0).split(",")[i]);
        }
        return header;
    }

    public List<String> getDataString(int column)
    {
        ArrayList<String> data = new ArrayList<>();
        for(int i = 1; i < numColumns; i++)
        {
            data.add(CSVData.get(i).split(",")[column]);
        }
        return data;
    }

    public List<Integer> getDataInt(int column)
    {
        ArrayList<Integer> data = new ArrayList<>();
        for(int i = 1; i < numColumns; i++)
        {
            data.add(Integer.parseInt(CSVData.get(i).split(",")[column]));
        }
        return data;
    }

    public List<Double> getDataDouble(int column)
    {
        ArrayList<Double> data = new ArrayList<>();
        for(int i = 1; i < numColumns; i++)
        {
            data.add(Double.parseDouble(CSVData.get(i).split(",")[column]));
        }
        return data;
    }

}
