import java.util.*;
import java.math.*;
import static java.lang.Math.*;

public class RectangularGrid {
	
	public long countRectangles(int width, int height) {
		long result = 0;
		for(long w=width;w>=1;w--) {
			long width_patterns = 1 + width - w;
			for(long h=height;h>=1;h--) {
				if(w == h) continue;
				long height_patterns = 1 + height - h;
				result += width_patterns * height_patterns;
			}
		}
		return result;
	}
}
