
public class Nota {
	
	private String Materia;
	private Double Valor;
	private String Estudiante;
	
	

	public Nota(String materia, Double valor, String estudiante) {
		
		Materia = materia;
		Valor = valor;
		Estudiante = estudiante;
	}

	public String getEstudiante() {
		return Estudiante;
	}

	public void setEstudiante(String estudiante) {
		Estudiante = estudiante;
	}

	public String getMateria() {
		return Materia;
	}

	public void setMateria(String materia) {
		Materia = materia;
	}

	public Double getValor() {
		return Valor;
	}

	public void setValor(Double valor) {
		Valor = valor;
	}
	public void ErrorNota (Double ValorNota) throws Try_Error {
		
        if (ValorNota < 0 || ValorNota > 5) {
        	
        	throw new Try_Error("La nota debe estar en 0.0 -- 5.0");
        }else {
        	
        	Valor = Valor+ValorNota;
        		System.out.println(Estudiante+" La Nota de "+ Materia + " es: "+Valor);
        }
	}
}