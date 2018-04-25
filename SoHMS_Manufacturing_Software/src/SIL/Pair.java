package SIL;

public class Pair<F,S> {
	
	    private F first; //first member of pair
	    private S second; //second member of pair

	    public Pair(F first, S second) {
	        this.first = first;
	        this.second = second;
	    }
	    
	    
	    @Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + ((first == null) ? 0 : first.hashCode());
			result = prime * result
					+ ((second == null) ? 0 : second.hashCode());
			return result;
		}

		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			@SuppressWarnings("rawtypes")
			Pair other = (Pair) obj;
			if (first == null) {
				if (other.first != null)
					return false;	
			}
			// If String
			else if (first.getClass()== String.class){
				if (!((String)first).equalsIgnoreCase((String)other.first))
					return false;
			}
			//If other than String
			else if (!first.equals(other.first))
				return false;
			
			if (second == null) {
				if (other.second != null)
					return false;
			}
			// If String
			else if (second.getClass()== String.class){
				if (!((String)second).equalsIgnoreCase((String)other.second))
					return false;
			}
			//If other than String 
			else if (!second.equals(other.second))
				return false;
			return true;
		}
//------------------------------------------------------------------------------------------------
	    public void setFirst(F first) {
	        this.first = first;
	    }

		public void setSecond(S second) {
	        this.second = second;
	    }

	    public F getFirst() {
	        return first;
	    }

	    public S getSecond() {
	        return second;
	    }
	    
}

