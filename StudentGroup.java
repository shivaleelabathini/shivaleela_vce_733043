import java.util.Date;

/**
 * A fix-sized array of students
 * array length should always be equal to the number of stored elements
 * after the element was removed the size of the array should be equal to the number of stored elements
 * after the element was added the size of the array should be equal to the number of stored elements
 * null elements are not allowed to be stored in the array
 * 
 * You may add new methods, fields to this class, but DO NOT RENAME any given class, interface or method
 * DO NOT PUT any classes into packages
 *
 */
public class StudentGroup implements StudentArrayOperation {

	private Student[] students;
	
	/**
	 * DO NOT remove or change this constructor, it will be used during task check
	 * @param length
	 */
	public StudentGroup(int length) {
		this.students = new Student[length];
	}

	@Override
	public Student[] getStudents() {
		// Add your implementation here
			return students;
	}

	@Override
	public void setStudents(Student[] students) {
		// Add your implementation here
		try{
			if(students==null)throw new IllegalArgumentException();
				
		}
		catch(IllegalArgumentException e){
		e.printStackTrace();
		}
		this.students=students;
	
	}

	@Override
	public Student getStudent(int index) {
		// Add your implementation here
		
		return students[index];
		
		
	}

	private void elseif(boolean b) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setStudent(Student student, int index) {
		// Add your implementation here
		try{
			if(student==null)throw new IllegalArgumentException();
			if(index<0 || index>=students.length) throw new IllegalArgumentException();
			
				students[index]=student;
				}
			catch(IllegalArgumentException e){
			e.printStackTrace();
			}
			
	}

	@Override
	public void addFirst(Student student) {
		// Add your implementation here
		try{
			if(student==null)throw new IllegalArgumentException();
			
			students[0]=student;
		}
		catch(IllegalArgumentException e){
			e.printStackTrace();
		}
		
	}

	@Override
	public void addLast(Student student) {
		// Add your implementation here
		try{
			if(students==null)throw new IllegalArgumentException();
		}
		catch(IllegalArgumentException e){
			e.printStackTrace();
		}

		students[students.length]=student;
	}

	@Override
	public void add(Student student, int index) {
		// Add your implementation here
		try{
			if(students==null)throw new IllegalArgumentException();
			if(index<0 || index>=students.length) throw new IllegalArgumentException();
			int size=students.length;
			for(int i=size;i>index;i--){
				students[i]=students[i-1];
			}
		}
		catch(IllegalArgumentException e)
		{
			e.printStackTrace();
		}
		students[index]=student;
	}

	@Override
	public void remove(int index) {
		try{
			
			if(students==null)throw new IllegalArgumentException();
			if(index<0 || index>=students.length) throw new IllegalArgumentException();
			for(int i=0;i<students.length;i++){
				if(students[i]==students[index]){
					students[index]=null;
					students[i]=students[i+1];
				}
				else throw new IllegalArgumentException();
			}
		}
		catch(IllegalArgumentException e)
		{
			e.printStackTrace();
		}
	}

	@Override
	public void remove(Student student) {
		// Add your implementation here
		int size=students.length;
		try{
		for (int i = 0; i < students.length; i++) {
            if (students[i] == student) {
                --size;
                for (; i < students.length; ++i) {
                    students[i] = students[i + 1];
                }
               
            }
            else throw new IllegalArgumentException();
        }
	}
		catch(IllegalArgumentException e)
		{
		 e.printStackTrace();
		}
	}

	@Override
	public void removeFromIndex(int index) {
		// Add your implementation here
        try{
			
			if(students==null)throw new IllegalArgumentException();
			if(index<0 || index>=students.length) throw new IllegalArgumentException();
			for(int i=index;i<students.length;i++){
				students[i+1]=null;
			}
         }
			catch(IllegalArgumentException e)
			{
				e.printStackTrace();
			}
		
		
	}

	@Override
	public void removeFromElement(Student student) {
		// Add your implementation here
		 try{
				
				if(students==null)throw new IllegalArgumentException();
				
				for(int i=0;i<students.length;i++){
					if(students[i]==student){
						for(int j=i+1;j<students.length;j++)
						          students[j]=null;
					}
				}
	         }
				catch(IllegalArgumentException e)
				{
					e.printStackTrace();
				}
			
	}

	@Override
	public void removeToIndex(int index) {
		// Add your implementation here
	}

	@Override
	public void removeToElement(Student student) {
		// Add your implementation here
	}

	@Override
	public void bubbleSort() {
		// Add your implementation here
		 
	  
	}

	@Override
	public Student[] getByBirthDate(Date date) {
		// Add your implementation here
		return null;
	}

	@Override
	public Student[] getBetweenBirthDates(Date firstDate, Date lastDate) {
		// Add your implementation here
		return null;
	}

	@Override
	public Student[] getNearBirthDate(Date date, int days) {
		// Add your implementation here
		return null;
	}

	@Override
	public int getCurrentAgeByDate(int indexOfStudent) {
		// Add your implementation here
		return 0;
	}

	@Override
	public Student[] getStudentsByAge(int age) {
		// Add your implementation here
		return null;
	}

	@Override
	public Student[] getStudentsWithMaxAvgMark() {
		// Add your implementation here
		return null;
	}

	@Override
	public Student getNextStudent(Student student) {
		// Add your implementation here
		try
		{
		if(students==null)throw new  IllegalArgumentException();
		for(int i=0;i<students.length;i++)
		{
			if(students.equals(student))
			{
				student=students[i+1];
			}
		}
		}
		catch(IllegalArgumentException e)
		{
			
			e.printStackTrace();


		}
		// Add your implementation here
		return null;
	
	
	}
}
