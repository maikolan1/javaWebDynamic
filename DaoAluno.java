package br.com.vemprafam.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Date;
import java.util.List;

import br.com.vemprafam.pojo.Aluno;

public class DaoAluno {
	private String user = "SA";
	private String password = "";
	private String url = "jdbc:hsqldb:hsql://localhost/";
	private Connection connection;

	public DaoAluno() {
		try {
			connection = DriverManager.getConnection(url, user, password);
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	public void inserir( Aluno aluno ) {
		try {
			String sql = "INSERT INTO ALUNOS VALUES(?,?,?,?)";
			PreparedStatement pstmt = connection.prepareStatement(sql);
			pstmt.setInt(1,  aluno.getRa());
			pstmt.setString(2, aluno.getNome());
			pstmt.setDate(3, new java.sql.Date(aluno.getDataNascimento().getTime()));
			pstmt.setDouble(4, aluno.getRenda());
			pstmt.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	public List<Aluno> getLista() {
		return null;
	}

	public Aluno buscarPeloRa(int ra) {
		return null;
	}

	public void atualizar(Aluno aluno) {
		try {
			String sql = "UPDATE ALUNOS SET nome=?,dataNascimento=?,renda=? WHERE ra=?";
			PreparedStatement pstmt = connection.prepareStatement(sql);
			pstmt.setString(1,  aluno.getNome());
			pstmt.setDate(2, new java.sql.Date(aluno.getDataNascimento().getTime()));
			pstmt.setDouble(3, aluno.getRenda());
			pstmt.setInt(4, aluno.getRa());
			pstmt.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	public void excluir(Aluno aluno) {
		try {
			String sql = "DELETE FROM ALUNOS WHERE RA=?";
			PreparedStatement pstmt = connection.prepareStatement(sql);
			pstmt.setInt(1,  aluno.getRa());
			pstmt.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	public static void main(String[] args) {
		DaoAluno dao= new DaoAluno();
		dao.atualizar(new Aluno(1,"boa noite",new Date(),5000));
	}

}
