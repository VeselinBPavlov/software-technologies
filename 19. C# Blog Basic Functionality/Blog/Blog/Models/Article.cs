﻿using System;
using System.Collections.Generic;
using System.ComponentModel.DataAnnotations;
using System.ComponentModel.DataAnnotations.Schema;
using System.Linq;
using System.Threading.Tasks;

namespace Blog.Models
{
    public class Article
    {
        [Key]
        public int Id { get; set; }

        [Required]
        [StringLength(50)]
        public string Title { get; set; }

        [Required]
        public string PublicationType { get; set; }

        [Required]
        [StringLength(250)]
        public string KeyWords { get; set; }

        public string Content { get; set; }

        public string Summary
        {
            get
            {
                return Content.Substring(0, 450);
            }
        }

        [ForeignKey("Author")]
        public string AuthorId { get; set; }

        public virtual ApplicationUser Author { get; set; }

        public bool IsAuthor(string name)
        {
            return this.Author.UserName.Equals(name);
        }
    }
}
