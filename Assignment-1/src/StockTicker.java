/*@uthor K.A.Gowtham
 * class StockTicker
 * String date
 * String time 
 * double price
 * integer volume 
 * doublev vwap
 * double bidPrice
 * integer bidSize
 * double askPrice
 * integeraskSize
 */
public class StockTicker {
	String date;
	String time;
	double price;
	int volume;
	double vwap;
	double bidPrice;
	int bidSize;
	double askPrice;
	int askSize;
	/*This constructor method is to get date 
	 * return date
	 * 
	 */
	public String getDate() {
		return date;
	}
	
	/*this constructor method is to set the date which not going to return anything
	 * public void setDate(String date)
	 * this.date = date
	 */
	public void setDate(String date) {
		this.date = date;
	}
	/*This constructor method is to get the time 
	 * public String getTime()
	 * return time 
	 */
	
	public String getTime() {
		return time;
	}
	
	/*this constructor method is to set the time which returns nothing
	 * public void setTime(String time)
	 * this.time = time
	 */
	public void setTime(String time) {
		this.time = time;
	}
	/*this constructor method is to get the price
	 * public double getPrice()
	 * return price
	 */
	
	public double getPrice() {
		return price;
	}
	/*This constructor method is to set the price which return nothing
	 * public void setPrice(double price)
	 * this.price = price
	 * 
	 */
	
	
	public void setPrice(double price) {
		this.price = price;
	}
	/*this constructor method is to get volume
	 * public int getVolume()
	 * return volume
	 * 
	 */
	
	public int getVolume() {
		return volume;
	}
	
	/*this constructor methos is to set volume which return nothing
	 * public void setVolume(int volume)
	 * this.volume=volume
	 * 
	 */
	public void setVolume(int volume) {
		this.volume = volume;
	}
	/*this constructor method is to get vwap
	 * public double getVwap
	 * return vwap
	 * 
	 */
	public double getVwap() {
		return vwap;
	}
	/*this constructor method is to set vwap which return nothing 
	 * public void setVwap(double vwap)
	 * this.vwap = vwap
	 */
	
	public void setVwap(double vwap) {
		this.vwap = vwap;
	}
	/*this constructor method is to get BidPrice
	 * public double getBidPrice
	 * return bidPrice
	 */
	
	public double getBidPrice() {
		return bidPrice;
	}
	
	/*this constructor method is to set BidPrice which return nothing
	 * public void setBidPrice(double bidPrice)
	 * this.bidPrice  = bidPrice
	 * 
	 */
	public void setBidPrice(double bidPrice) {
		this.bidPrice = bidPrice;
	}
	
	/*this constructor method is to getBidSize
	 * public int getBidSize
	 * return bidSize
	 */
	public int getBidSize() {
		return bidSize;
	}
	/*this constructor method is to set Bid Size which returns nothing
	 * public void setBidSize(int bidSize)
	 * this.bidSize = bidSize
	 * 
	 */
	public void setBidSize(int bidSize) {
		this.bidSize = bidSize;
	}
	/*this constructor method is to get AskPrice
	 * public double getAskPrice
	 * return askPrice
	 * 
	 */
	public double getAskPrice() {
		return askPrice;
	}
	/*this constructor method is to setAskPrice
	 * public void setAskPrice(double askPrice)
	 * this.askPrice = askPrice
	 */
	public void setAskPrice(double askPrice) {
		this.askPrice = askPrice;
	}
	/*this constructor method is to get ask price 
	 * public intgetAskPrice()
	 * return askSize
	 */
	public int getAskSize() {
		return askSize;
	}
	/*this ocnstructor method is to set ask price 
	 * public void setAskSize(int askSize)
	 * this.askSize = askSize
	 */
	public void setAskSize(int askSize) {
		this.askSize = askSize;
	}
	
	/*create StockerTicker class
	 * public static StockTicker create(final String... args)
	 * if (args.length not equal to 9)
	 *     return null
	 *endIf     
	 *final StockTicker rv = new StockTicker() // Initialize new StockTicker object
	 *rv.setDate(args[0])     
	 *rv.setTime(args[1]
	 *rv.setPrice(Double.parseDouble(args[2])) // parseDouble return the primitive double containing the value of the string
	 * rv.setVolume(Integer.parseInt(args[3])) // parse Interger return the primitive integer conatning the value of the string    
	 * rv.setVwap(DOuble.parseDouble(args[4])) 
	 * rv.setBidPrice(Double.parseDouble(args[5]))
	 * rv.setBidSize(Integer.parseInt(args[6]))
     * rv.setAskPrice(Double.parseDouble(args[7]))
     * rv.setAskSize(Integer.parseInt(args[8])) 
	 * 
	 * return rv
	 * 
	 */
	 
	 
	public static StockTicker create(final String... args) {
        if (args.length != 9) {
            return null; 
        }
        final StockTicker rv = new StockTicker();
        rv.setDate(args[0]);
        rv.setTime(args[1]);
        rv.setPrice(Double.parseDouble(args[2]));
        rv.setVolume(Integer.parseInt(args[3]));
        rv.setVwap(Double.parseDouble(args[4]));
        rv.setBidPrice(Double.parseDouble(args[5]));
        rv.setBidSize(Integer.parseInt(args[6]));
        rv.setAskPrice(Double.parseDouble(args[7]));
        rv.setAskSize(Integer.parseInt(args[8]));
        return rv;
    }

}
