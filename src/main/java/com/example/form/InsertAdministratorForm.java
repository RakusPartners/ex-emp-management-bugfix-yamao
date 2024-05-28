package com.example.form;

import jakarta.validation.constraints.AssertTrue;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;

/**
 * 管理者情報登録時に使用するフォーム.
 * 
 * @author igamasayuki
 * 
 */
public class InsertAdministratorForm {
	/** 名前 */
	@NotBlank (message="名前を入力してください")
	private String name;
	/** メールアドレス */
	@NotBlank (message="メールアドレスを入力してください")
	@Email (message="メールアドレスの形式ではありません")
	private String mailAddress;
	/** パスワード */
	@NotBlank(message="パスワードを入力してください")
	private String password;
	/**確認用パスワード */
	@NotBlank(message="確認用パスワードを入力してください")
	private String passwordConfirmation;

	@AssertTrue(message = "パスワードと確認用パスワードが一致しません")
	public boolean isPasswordValid(){
		return this.password != null && this.password.equals(this.passwordConfirmation);

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMailAddress() {
		return mailAddress;
	}

	public void setMailAddress(String mailAddress) {
		this.mailAddress = mailAddress;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getPasswordConfirmation() {
		return passwordConfirmation;
	}

	public void setPasswordConfirmation(String passwordConfirmation) {
		this.passwordConfirmation = passwordConfirmation;
	}

	@Override
	public String toString() {
		return "InsertAdministratorForm [name=" + name + ", mailAddress=" + mailAddress + ", password=" + password
				+ ", passwordConfirmation=" + passwordConfirmation + "]";
	}


	

}
